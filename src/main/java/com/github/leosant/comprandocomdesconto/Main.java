package com.github.leosant.comprandocomdesconto;

import com.github.leosant.comprandocomdesconto.entity.Loja;
import com.github.leosant.comprandocomdesconto.entity.fields.Item;
import com.github.leosant.comprandocomdesconto.service.DescontoService;
import com.github.leosant.comprandocomdesconto.service.IDesconto;
import com.github.leosant.comprandocomdesconto.util.LojaUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    Locale.setDefault(Locale.ENGLISH);

    Loja loja = new Loja(mockItems());
    System.out.println("COMPUTANDO VALORES...");

    Thread.sleep(2000);
    System.out.printf("%n%n---------------VALORES---------------%n%n");

    loja.getItens()
        .forEach(Main::computarLoja);
  }

  public static void computarLoja(Item item) {

    IDesconto descontoService = new DescontoService();
    double precoFinal = descontoService.getDesconto(item);
    LojaUtil.apresentarValoresAoCliente(item.getTotalPreco(), precoFinal);
  }

  private static List<Item> mockItems() {
    return new ArrayList<>(
        Arrays.asList(new Item(1.00, 40),
            new Item(100.00, 10),
            new Item(1000.00, 10),
            new Item(56.75, 1),
            new Item(1.50,2),
            new Item(2608542.45, 39)
        )
    );
  }

}

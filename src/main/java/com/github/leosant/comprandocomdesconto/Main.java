package com.github.leosant.comprandocomdesconto;

import com.github.leosant.comprandocomdesconto.entity.Produto;
import com.github.leosant.comprandocomdesconto.entity.ProdutoBuilder;
import com.github.leosant.comprandocomdesconto.service.DescontoService;
import com.github.leosant.comprandocomdesconto.service.IDesconto;
import com.github.leosant.comprandocomdesconto.util.LojaUtil;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    Locale.setDefault(Locale.ENGLISH);

    var listaProdutos = mockItems();
    System.out.println("COMPUTANDO VALORES...");

    Thread.sleep(2000);
    System.out.printf("%n%n---------------VALORES---------------%n%n");

    listaProdutos.forEach(Main::computarLoja);
  }

  public static void computarLoja(Produto produto) {

    IDesconto descontoService = new DescontoService();
    double precoFinal = descontoService.getDesconto(produto);
    LojaUtil.apresentarValoresAoCliente(produto.getTotalPreco(), precoFinal);
  }

  private static List<Produto> mockItems() {

    var produto1 = ProdutoBuilder.builder().Preco(1.00).Quantidade(40).build();
    var produto2 = ProdutoBuilder.builder().Preco(100.00).Quantidade(10).build();
    var produto3 = ProdutoBuilder.builder().Preco(1000.00).Quantidade(10).build();
    var produto4 = ProdutoBuilder.builder().Preco(56.75).Quantidade(1).build();
    var produto5 = ProdutoBuilder.builder().Preco(1.50).Quantidade(2).build();
    var produto6 = ProdutoBuilder.builder().Preco(2608542.45).Quantidade(39).build();

    return Arrays.asList(produto1,
        produto2,
        produto3,
        produto4,
        produto5,
        produto6
    );
  }

}

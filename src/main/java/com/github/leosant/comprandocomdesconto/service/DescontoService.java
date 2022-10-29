package com.github.leosant.comprandocomdesconto.service;

import com.github.leosant.comprandocomdesconto.entity.fields.Item;

public class DescontoService implements IDesconto{

  private static final double DESCONTO_FIXO = 0.1;
  private static final double DESCONTO_POR_QUANTIDADES = 0.01;


  @Override
  public double getDesconto(Item item) {
    var descontoFixo = calcularDescontoFixo(item.getTotalPreco());
    var descontoVariavel = calcularDescontoVariavel(item.getTotalPreco(), item.getQuantidade());
    var totalDescontos = calcularTodosOsDescontos(descontoFixo, descontoVariavel);
    return realizarDescontos(item.getTotalPreco(), totalDescontos);
  }



  @Override
  public double realizarDescontos(double preco, double totalDesconto) {
    return preco - totalDesconto;
  }

  @Override
  public double calcularDescontoFixo(double preco) {
    return preco*DESCONTO_FIXO;
  }

  @Override
  public double calcularDescontoVariavel(double preco, int quantidades) {
    return preco*(quantidades*DESCONTO_POR_QUANTIDADES);
  }

  @Override
  public double calcularTodosOsDescontos(double descontoFixo, double descontoVariavel) {
    return descontoFixo + descontoVariavel;
  }
}

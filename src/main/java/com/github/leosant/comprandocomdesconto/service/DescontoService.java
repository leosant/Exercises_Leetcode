package com.github.leosant.comprandocomdesconto.service;

import com.github.leosant.comprandocomdesconto.entity.Produto;

public class DescontoService implements IDesconto{

  private static final double DESCONTO_FIXO = 0.1;
  private static final double DESCONTO_POR_QUANTIDADES = 0.01;


  @Override
  public double getDesconto(Produto produto) {
    var descontoFixo = calcularDescontoFixo(produto.getTotalPreco());
    var descontoVariavel = calcularDescontoVariavel(produto.getTotalPreco(), produto.getQuantidade());
    var totalDescontos = calcularTodosDescontos(descontoFixo, descontoVariavel);
    return realizarDescontos(produto.getTotalPreco(), totalDescontos);
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
  public double calcularTodosDescontos(double descontoFixo, double descontoVariavel) {
    return descontoFixo + descontoVariavel;
  }
}

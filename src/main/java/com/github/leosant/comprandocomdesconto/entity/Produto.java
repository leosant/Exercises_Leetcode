package com.github.leosant.comprandocomdesconto.entity;

public class Produto {

  private final double preco;
  private final int quantidade;

  protected Produto(double preco, int quantidade) {
    this.preco = preco;
    this.quantidade = quantidade;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }


  public double getTotalPreco() {
    return this.preco*this.quantidade;
  }

}

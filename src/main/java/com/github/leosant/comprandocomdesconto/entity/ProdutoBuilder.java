package com.github.leosant.comprandocomdesconto.entity;

public class ProdutoBuilder {

  private double preco;
  private int quantidade;

  public static ProdutoBuilder builder() {
    return new ProdutoBuilder();
  }

  public ProdutoBuilder Preco(double preco) {
    this.preco = preco;
    return this;
  }

  public ProdutoBuilder Quantidade(int quantidade) {
    this.quantidade = quantidade;
    return this;
  }

  public Produto build() {
    return new Produto(preco, quantidade);
  }
}

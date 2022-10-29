package com.github.leosant.comprandocomdesconto.entity.fields;

public class Item {

  private double preco;
  private int quantidade;

  public Item(double preco, int quantidade) {
    this.preco = preco;
    this.quantidade = quantidade;
  }


  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public double getTotalPreco() {
    return this.preco*this.quantidade;
  }
}

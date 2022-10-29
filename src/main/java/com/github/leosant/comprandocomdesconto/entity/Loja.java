package com.github.leosant.comprandocomdesconto.entity;

import com.github.leosant.comprandocomdesconto.entity.fields.Item;
import java.util.List;

public class Loja {

  private List<Item> itens;

  public Loja(List<Item> itens) {
    this.itens = itens;
  }

  public List<Item> getItens() {
    return itens;
  }

  public void setItens(List<Item> itens) {
    this.itens = itens;
  }
}

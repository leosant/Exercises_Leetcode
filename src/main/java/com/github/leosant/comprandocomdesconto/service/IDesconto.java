package com.github.leosant.comprandocomdesconto.service;

import com.github.leosant.comprandocomdesconto.entity.fields.Item;

public interface IDesconto {

  double getDesconto(Item item);
  double realizarDescontos(double preco, double totalDesconto);
  double calcularDescontoFixo(double preco);
  double calcularDescontoVariavel(double preco, int quantidades);

  double calcularTodosOsDescontos(double descontoFixo, double descontoVariavel);

}

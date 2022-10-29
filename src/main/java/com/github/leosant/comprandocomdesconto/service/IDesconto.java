package com.github.leosant.comprandocomdesconto.service;

import com.github.leosant.comprandocomdesconto.entity.Produto;

public interface IDesconto {

  double getDesconto(Produto produto);
  double realizarDescontos(double preco, double totalDesconto);
  double calcularDescontoFixo(double preco);
  double calcularDescontoVariavel(double preco, int quantidades);
  double calcularTodosDescontos(double descontoFixo, double descontoVariavel);

}

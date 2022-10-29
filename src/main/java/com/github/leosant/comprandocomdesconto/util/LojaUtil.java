package com.github.leosant.comprandocomdesconto.util;

public class LojaUtil {

  public static void apresentarValoresAoCliente(double precoSemDesconto, double precoComDesconto) {
    System.out.printf("Valor Total sem descontos: %.2f %n", precoSemDesconto);
    System.out.printf("Valor total com descontos aplicados: %.2f %n", precoComDesconto);
    System.out.println("-----------------------------------------");
  }
}

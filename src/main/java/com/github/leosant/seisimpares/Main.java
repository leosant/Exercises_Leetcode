package com.github.leosant.seisimpares;

public class Main {

  public static void main(String[] args) {

    int x = 13;
    int contador = 0;

    while (contador < 5) {

      if (x % 2 == 0) {
        System.out.println(x += 1);
      }
      else {
        if (contador == 0) {
          System.out.println(x);
        }
      }
      System.out.println(x += 2);
      contador++;
    }

  }
}

package com.github.leosant.listaencadeada;

public class Main {

    public static void main(String[] args) {
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();
        listaEncadeada.adiciona(1);
        listaEncadeada.adiciona(2);

        System.out.println(listaEncadeada);
    }
}

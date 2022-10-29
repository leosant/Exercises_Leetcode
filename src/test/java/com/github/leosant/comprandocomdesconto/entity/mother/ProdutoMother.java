package com.github.leosant.comprandocomdesconto.entity.mother;

import com.github.leosant.comprandocomdesconto.entity.Produto;
import com.github.leosant.comprandocomdesconto.entity.ProdutoBuilder;

public class ProdutoMother {

  public static Produto produtoComPrecoEQuantidade() {
    return ProdutoBuilder.builder()
        .Preco(1.00)
        .Quantidade(40)
        .build();
  }

  public static Produto produtoNulo() {
    return null;
  }
}

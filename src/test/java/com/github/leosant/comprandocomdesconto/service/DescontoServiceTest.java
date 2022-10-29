package com.github.leosant.comprandocomdesconto.service;


import static org.junit.Assert.assertEquals;

import com.github.leosant.comprandocomdesconto.entity.Produto;
import com.github.leosant.comprandocomdesconto.entity.mother.ProdutoMother;
import org.junit.Before;
import org.junit.Test;

public class DescontoServiceTest {

  private IDesconto descontoService;

  @Before
  public void antesDe() {
    descontoService = new DescontoService();
  }

  @Test
  public void naoDeveTerProdutoCadastrado() {
    var produto = ProdutoMother.produtoNulo();
    var retorno = descontoService.getDesconto(produto);
    assertEquals(20.00, retorno, 0.01);
  }

  @Test
  public void deveDevolverPrecoComDesconto() {
    var produto = ProdutoMother.produtoComPrecoEQuantidade();
    var retorno = descontoService.getDesconto(produto);
    assertEquals(20.00, retorno, 0.01);
  }

  @Test
  public void deveRealizarDescontos() {
    var preco = 40.00;
    var totalDesconto = 20.00;
    var retorno = descontoService.realizarDescontos(preco, totalDesconto);
    assertEquals(20.00, retorno, 0.01);
  }

  @Test
  public void deveCalcularTodosDescontos() {
    var descontoFixo = 4.00;
    var descontoVariavel = 16.00;
    var retorno = descontoService.calcularTodosDescontos(descontoFixo, descontoVariavel);
    assertEquals(20.00, retorno, 0.01);
  }

  @Test
  public void deveCalcularDescontoFixoDezPorCento() {
    var preco = 40.00;
    var retorno = descontoService.calcularDescontoFixo(preco);
    assertEquals(4.00, retorno, 0.01);
  }

  @Test
  public void deveCalcularDescontoVariavelUmPorCentoPorQuantidade() {
    var preco = 40.00;
    var quantidade = 50;
    var retorno = descontoService.calcularDescontoVariavel(preco, quantidade);
    assertEquals(20.00, retorno, 0.01);
  }
}

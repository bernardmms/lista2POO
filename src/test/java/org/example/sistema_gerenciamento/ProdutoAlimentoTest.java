package org.example.sistema_gerenciamento;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoAlimentoTest {

    @Test
    public void testCalcularPrecoTotalPorQuilo() {
        ProdutoAlimento queijo = new ProdutoAlimento("Queijo Minas", 50.00, 10.5); // 50/kg
        double preco = queijo.calcularPrecoTotal(1.5); // Comprando 1.5kg
        assertEquals(75.00, preco, 0.001);
        assertEquals(9.0, queijo.getQuantidadeEmEstoque(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcularPrecoComEstoqueInsuficiente() {
        ProdutoAlimento picanha = new ProdutoAlimento("Picanha", 80.00, 5.0);
        picanha.calcularPrecoTotal(5.1);
    }

    @Test
    public void testVendaExataDoEstoque() {
        ProdutoAlimento tomate = new ProdutoAlimento("Tomate", 8.00, 2.5);
        double preco = tomate.calcularPrecoTotal(2.5);
        assertEquals(20.00, preco, 0.001);
        assertEquals(0.0, tomate.getQuantidadeEmEstoque(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testComprarQuantidadeNegativa() {
        ProdutoAlimento batata = new ProdutoAlimento("Batata", 5.00, 30.0);
        batata.calcularPrecoTotal(-2.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarAlimentoComPrecoZero() {
        new ProdutoAlimento("Cebola", 0.0, 50.0);
    }
}
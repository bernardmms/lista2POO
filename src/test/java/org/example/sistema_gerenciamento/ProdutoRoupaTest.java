package org.example.sistema_gerenciamento;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoRoupaTest {

    @Test
    public void testCalcularPrecoComDesconto() {
        ProdutoRoupa camisa = new ProdutoRoupa("Camisa Polo", 150.00, 20, 0.10); // 10% off
        double preco = camisa.calcularPrecoTotal(3);
        // (150 * 3) * 0.9 = 405.00
        assertEquals(405.00, preco, 0.001);
        assertEquals(17, camisa.getQuantidadeEmEstoque(), 0.001);
    }

    @Test
    public void testCalcularPrecoSemDesconto() {
        ProdutoRoupa calca = new ProdutoRoupa("Calça Jeans", 200.00, 15, 0.0);
        double preco = calca.calcularPrecoTotal(2);
        assertEquals(400.00, preco, 0.001);
        assertEquals(13, calca.getQuantidadeEmEstoque(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcularPrecoComEstoqueInsuficiente() {
        ProdutoRoupa jaqueta = new ProdutoRoupa("Jaqueta de Couro", 500.00, 2, 0.05);
        jaqueta.calcularPrecoTotal(3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarRoupaComDescontoInvalido() {
        new ProdutoRoupa("Vestido", 300.00, 10, 1.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarRoupaComDescontoNegativo() {
        new ProdutoRoupa("Saia", 120.00, 10, -0.1);
    }
}
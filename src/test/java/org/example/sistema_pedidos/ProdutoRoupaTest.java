package org.example.sistema_pedidos;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoRoupaTest {

    @Test
    public void testCalcularPrecoComDescontoDeVintePorcento() {
        ProdutoRoupa calca = new ProdutoRoupa("Calça Jeans", 200.00);
        assertEquals(160.00, calca.calcularPreco(), 0.001);
    }

    @Test
    public void testCalcularPrecoOutroValor() {
        ProdutoRoupa vestido = new ProdutoRoupa("Vestido de Festa", 450.00);
        assertEquals(360.00, vestido.calcularPreco(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarProdutoComPrecoInvalido() {
        new ProdutoRoupa("Camiseta", -50.00);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarProdutoComNomeInvalido() {
        new ProdutoRoupa("", 100.00);
    }
}
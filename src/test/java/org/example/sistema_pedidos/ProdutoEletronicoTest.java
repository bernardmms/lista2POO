package org.example.sistema_pedidos;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoEletronicoTest {

    @Test
    public void testCalcularPrecoComDescontoDeDezPorcento() {
        ProdutoEletronico tv = new ProdutoEletronico("Smart TV 50", 3000.00);
        assertEquals(2700.00, tv.calcularPreco(), 0.001);
    }

    @Test
    public void testCalcularPrecoOutroValor() {
        ProdutoEletronico smartphone = new ProdutoEletronico("Smartphone X", 1500.00);
        assertEquals(1350.00, smartphone.calcularPreco(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarProdutoComPrecoNegativo() {
        new ProdutoEletronico("Notebook Gamer", -4500.00);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarProdutoComPrecoZero() {
        new ProdutoEletronico("Tablet", 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarProdutoComNomeVazio() {
        new ProdutoEletronico("  ", 500.00);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarProdutoComNomeNulo() {
        new ProdutoEletronico(null, 500.00);
    }
}
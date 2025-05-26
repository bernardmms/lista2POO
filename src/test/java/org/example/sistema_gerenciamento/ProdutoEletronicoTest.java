package org.example.sistema_gerenciamento;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoEletronicoTest {

    @Test
    public void testCalcularPrecoTotalComEstoqueSuficiente() {
        ProdutoEletronico tv = new ProdutoEletronico("Smart TV", 2500.00, 10);
        double preco = tv.calcularPrecoTotal(2);
        assertEquals(5000.00, preco, 0.001);
        assertEquals(8, tv.getQuantidadeEmEstoque(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcularPrecoTotalSemEstoque() {
        ProdutoEletronico fone = new ProdutoEletronico("Fone de Ouvido", 300.00, 5);
        fone.calcularPrecoTotal(6);
    }

    @Test
    public void testVendaZeraEstoque() {
        ProdutoEletronico monitor = new ProdutoEletronico("Monitor 4K", 1800.00, 1);
        double preco = monitor.calcularPrecoTotal(1);
        assertEquals(1800.00, preco, 0.001);
        assertEquals(0, monitor.getQuantidadeEmEstoque(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTentarComprarQuantidadeZero() {
        ProdutoEletronico teclado = new ProdutoEletronico("Teclado Mecânico", 450.00, 20);
        teclado.calcularPrecoTotal(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarProdutoComEstoqueNegativo() {
        new ProdutoEletronico("Mouse Gamer", 250.00, -5);
    }
}
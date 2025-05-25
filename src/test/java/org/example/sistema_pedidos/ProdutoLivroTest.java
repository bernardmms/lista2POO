package org.example.sistema_pedidos;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoLivroTest {

    @Test
    public void testCalcularPrecoComDescontoDeCincoPorcento() {
        ProdutoLivro livro = new ProdutoLivro("O Senhor dos Anéis", 100.00);
        assertEquals(95.00, livro.calcularPreco(), 0.001);
    }

    @Test
    public void testCalcularPrecoOutroValor() {
        ProdutoLivro manga = new ProdutoLivro("One Piece Vol. 1", 30.00);
        assertEquals(28.50, manga.calcularPreco(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarProdutoComPrecoInvalido() {
        new ProdutoLivro("A Guerra dos Tronos", -90.00);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarProdutoComNomeInvalido() {
        new ProdutoLivro(null, 45.00);
    }
}
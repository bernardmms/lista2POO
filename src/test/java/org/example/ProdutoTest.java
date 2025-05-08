package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    void gettersAndSettersFuncionam() {
        Produto p = new Produto();
        p.setNome("Caneta");
        p.setPreco(2.50);
        p.setQuantidade_estoque(100);
        p.setCategoria("Papelaria");

        assertEquals("Caneta", p.getNome());
        assertEquals(2.50, p.getPreco());
        assertEquals(100, p.getQuantidade_estoque());
        assertEquals("Papelaria", p.getCategoria());
    }

    @Test
    void adicionarEstoqueValido() {
        Produto p = new Produto();
        p.adicionar_estoque(30);
        assertEquals(30, p.getQuantidade_estoque());
        p.adicionar_estoque(20);
        assertEquals(50, p.getQuantidade_estoque());
    }

    @Test
    void adicionarEstoqueNegativoLancaExcecao() {
        Produto p = new Produto();
        assertThrows(IllegalArgumentException.class, () -> p.adicionar_estoque(0));
        assertThrows(IllegalArgumentException.class, () -> p.adicionar_estoque(-5));
    }

    @Test
    void removerEstoqueValido() {
        Produto p = new Produto();
        p.setQuantidade_estoque(40);
        p.remover_estoque(10);
        assertEquals(30, p.getQuantidade_estoque());
    }

    @Test
    void removerEstoqueInsuficienteLancaExcecao() {
        Produto p = new Produto();
        p.setQuantidade_estoque(10);
        assertThrows(IllegalArgumentException.class, () -> p.remover_estoque(20));
    }

    @Test
    void removerEstoqueNegativoLancaExcecao() {
        Produto p = new Produto();
        p.setQuantidade_estoque(10);
        assertThrows(IllegalArgumentException.class, () -> p.remover_estoque(0));
        assertThrows(IllegalArgumentException.class, () -> p.remover_estoque(-3));
    }

    @Test
    void aplicarDescontoValido() {
        Produto p = new Produto();
        p.setPreco(200.0);
        p.aplicar_desconto(25.0);
        assertEquals(150.0, p.getPreco(), 0.0001);
    }

    @Test
    void aplicarDescontoZeroNenhumaMudanca() {
        Produto p = new Produto();
        p.setPreco(100.0);
        p.aplicar_desconto(0);
        assertEquals(100.0, p.getPreco(), 0.0001);
    }

    @Test
    void aplicarDescontoCemZeraPreco() {
        Produto p = new Produto();
        p.setPreco(80.0);
        p.aplicar_desconto(100);
        assertEquals(0.0, p.getPreco(), 0.0001);
    }

    @Test
    void aplicarDescontoInvalidoLancaExcecao() {
        Produto p = new Produto();
        p.setPreco(50.0);
        assertThrows(IllegalArgumentException.class, () -> p.aplicar_desconto(-10.0));
        assertThrows(IllegalArgumentException.class, () -> p.aplicar_desconto(150.0));
    }
}

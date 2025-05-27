package org.example.sistema_biblioteca;

import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;

public class LivroTest {

    @Test
    public void testCalcularDataDevolucao() {
        Livro livro = new Livro("O Senhor dos Anéis", LocalDate.of(1954, 7, 29));
        LocalDate dataEmprestimo = LocalDate.of(2025, 5, 26);
        LocalDate dataDevolucao = livro.calcularDataDevolucao(dataEmprestimo);
        assertEquals(LocalDate.of(2025, 6, 10), dataDevolucao);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcularDataDevolucaoComDataNula() {
        Livro livro = new Livro("A Revolução dos Bichos", LocalDate.of(1945, 8, 17));
        livro.calcularDataDevolucao(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarLivroComTituloVazio() {
        new Livro("  ", LocalDate.of(1886, 1, 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarLivroComDataPublicacaoNula() {
        new Livro("Dom Quixote", null);
    }
}
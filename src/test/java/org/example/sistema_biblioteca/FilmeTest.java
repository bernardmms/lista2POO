package org.example.sistema_biblioteca;

import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;

public class FilmeTest {

    @Test
    public void testCalcularDataDevolucao() {
        Filme filme = new Filme("O Poderoso Chefão", LocalDate.of(1972, 3, 24));
        LocalDate dataEmprestimo = LocalDate.of(2025, 1, 10);
        LocalDate dataDevolucao = filme.calcularDataDevolucao(dataEmprestimo);
        assertEquals(LocalDate.of(2025, 1, 15), dataDevolucao);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcularDataDevolucaoComDataNula() {
        Filme filme = new Filme("Pulp Fiction", LocalDate.of(1994, 10, 14));
        filme.calcularDataDevolucao(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarFilmeComTituloVazio() {
        new Filme(" ", LocalDate.of(2001, 4, 2));
    }
}
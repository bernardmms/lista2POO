package org.example.sistema_biblioteca;

import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;

public class RevistaTest {

    @Test
    public void testCalcularDataDevolucao() {
        Revista revista = new Revista("Superinteressante", LocalDate.of(2025, 5, 1));
        LocalDate dataEmprestimo = LocalDate.of(2025, 5, 20);
        LocalDate dataDevolucao = revista.calcularDataDevolucao(dataEmprestimo);
        assertEquals(LocalDate.of(2025, 5, 27), dataDevolucao);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcularDataDevolucaoComDataNula() {
        Revista revista = new Revista("Veja", LocalDate.of(2025, 4, 15));
        revista.calcularDataDevolucao(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarRevistaComTituloNulo() {
        new Revista(null, LocalDate.of(1968, 9, 11));
    }
}
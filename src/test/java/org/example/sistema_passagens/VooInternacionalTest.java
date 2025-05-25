package org.example.sistema_passagens;

import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;

public class VooInternacionalTest {

    @Test
    public void testCalcularPrecoVooInternacional() {
        Voo voo = new VooInternacional("São Paulo", "Nova York", 7700, LocalDate.now());
        double precoEsperado = (7700 * 1.2) + 100.0;
        assertEquals(precoEsperado, voo.calcularPreco(), 0.001);
    }

    @Test
    public void testCalcularPrecoParaOutroDestino() {
        Voo voo = new VooInternacional("Rio de Janeiro", "Paris", 9200, LocalDate.now());
        double precoEsperado = (9200 * 1.2) + 100.0;
        assertEquals(precoEsperado, voo.calcularPreco(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarVooComDistanciaZero() {
        new VooInternacional("Lisboa", "Madrid", 0, LocalDate.now());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarVooComOrigemNula() {
        new VooInternacional(null, "Tóquio", 18500, LocalDate.now());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarVooComDestinoVazio() {
        new VooInternacional("Sydney", "   ", 13500, LocalDate.now());
    }
}
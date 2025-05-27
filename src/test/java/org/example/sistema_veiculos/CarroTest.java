package org.example.sistema_veiculos;

import org.junit.Test;
import static org.junit.Assert.*;

public class CarroTest {

    @Test
    public void testCalcularCustoCarro() {
        Carro carro = new Carro("Toyota", "Corolla", 90000.0);
        assertEquals(112500.0, carro.calcularCusto(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarCarroComPrecoZero() {
        new Carro("Fiat", "Mobi", 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarCarroComMarcaNula() {
        new Carro(null, "Civic", 100000.0);
    }
}
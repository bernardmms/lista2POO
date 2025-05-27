package org.example.sistema_veiculos;

import org.junit.Test;
import static org.junit.Assert.*;

public class MotoTest {

    @Test
    public void testCalcularCustoMoto() {
        Moto moto = new Moto("Honda", "CB 500", 30000.0);
        assertEquals(33000.0, moto.calcularCusto(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarMotoComPrecoNegativo() {
        new Moto("Yamaha", "MT-07", -45000.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarMotoComModeloVazio() {
        new Moto("Suzuki", "  ", 50000.0);
    }
}
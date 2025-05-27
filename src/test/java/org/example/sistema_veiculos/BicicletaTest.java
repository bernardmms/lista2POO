package org.example.sistema_veiculos;

import org.junit.Test;
import static org.junit.Assert.*;

public class BicicletaTest {

    @Test
    public void testCalcularCustoBicicleta() {
        Bicicleta bicicleta = new Bicicleta("Caloi", "Explorer", 2000.0);
        assertEquals(2100.0, bicicleta.calcularCusto(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarBicicletaComPrecoZero() {
        new Bicicleta("Specialized", "Rockhopper", 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCriarBicicletaComMarcaVazia() {
        new Bicicleta(" ", "Trek", 3000.0);
    }
}
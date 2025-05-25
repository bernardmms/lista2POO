package org.example.forma_geometrica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {
    @Test
    public void testSetRaioValido() {
        Circulo c = new Circulo();
        c.setRaio(5.0);
        assertEquals(5.0, c.getRaio());
    }

    @Test
    public void testSetRaioInvalido() {
        Circulo c = new Circulo();
        assertThrows(IllegalArgumentException.class, () -> c.setRaio(0));
        assertThrows(IllegalArgumentException.class, () -> c.setRaio(-2));
    }

    @Test
    public void testSetAreaValida() {
        Circulo c = new Circulo();
        c.setArea(Math.PI * 4 * 4);

        assertEquals(Math.PI * 4 * 4, c.getArea());
    }

    @Test
    public void testSetAreaInvalida() {
        Circulo c = new Circulo();
        assertThrows(IllegalArgumentException.class, () -> c.setArea(0));
        assertThrows(IllegalArgumentException.class, () -> c.setArea(-10));
    }

    @Test
    public void testCalcularArea() {
        Circulo c = new Circulo();
        c.setRaio(3.0);
        double expected = Math.PI * 3.0 * 3.0;
        assertEquals(expected, c.calcularArea());
    }

    @Test
    public void testCalcularPerimetro() {
        Circulo c = new Circulo();
        c.setRaio(2.0);
        double expected = 2 * Math.PI * 2.0;
        assertEquals(expected, c.calcularPerimetro());
    }

}
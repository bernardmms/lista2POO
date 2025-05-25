package org.example.forma_geometrica;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    private Retangulo retangulo;

    @Test
    public void testSetAlturaValida() {
        Retangulo ret = new Retangulo();
        ret.setAltura(10.0);
        assertEquals(10.0, ret.getAltura());
    }

    @Test
    public void testSetAlturaInvalida() {
        Retangulo ret = new Retangulo();
        assertThrows(IllegalArgumentException.class, () -> ret.setAltura(0));
        assertThrows(IllegalArgumentException.class, () -> ret.setAltura(-5));
    }

    @Test
    public void testSetLarguraValida() {
        Retangulo ret = new Retangulo();
        ret.setLargura(5.5);
        assertEquals(5.5, ret.getLargura());
    }

    @Test
    public void testSetLarguraInvalida() {
        Retangulo ret = new Retangulo();
        assertThrows(IllegalArgumentException.class, () -> ret.setLargura(0));
        assertThrows(IllegalArgumentException.class, () -> ret.setLargura(-3));
    }

    @Test
    public void testCalcularArea() {
        Retangulo ret = new Retangulo();
        ret.setAltura(10.0);
        ret.setLargura(4.0);
        assertEquals(40.0, ret.calcularArea());
    }

    @Test
    public void testCalcularPerimetro() {
        Retangulo ret = new Retangulo();
        ret.setAltura(2.0);
        ret.setLargura(3.0);
        assertEquals(10.0, ret.calcularPerimetro());
    }

}
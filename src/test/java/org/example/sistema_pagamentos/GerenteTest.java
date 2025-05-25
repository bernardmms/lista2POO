package org.example.sistema_pagamentos;

import org.junit.Test;
import static org.junit.Assert.*;

public class GerenteTest {

    @Test
    public void testCalcularPagamento() {
        Gerente gerente = new Gerente(5000.00, 1000.00);
        assertEquals(6000.00, gerente.calcularPagamento(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarGerenteComSalarioInvalido() {
        new Gerente(-5000.00, 1000.00);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarGerenteComBonusInvalido() {
        new Gerente(5000.00, -1000.00);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarGerenteComBonusZero() {
        new Gerente(5000.00, 0);
    }

    @Test
    public void testSetBonusValido() {
        Gerente gerente = new Gerente(5000.00, 1000.00);
        gerente.setBonus(1200.00);
        assertEquals(6200.00, gerente.calcularPagamento(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBonusInvalido() {
        Gerente gerente = new Gerente(5000.00, 1000.00);
        gerente.setBonus(-200.00);
    }
}
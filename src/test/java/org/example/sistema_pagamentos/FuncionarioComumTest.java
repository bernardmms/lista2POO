package org.example.sistema_pagamentos;

import org.junit.Test;
import static org.junit.Assert.*;

public class FuncionarioComumTest {

    @Test
    public void testCalcularPagamento() {
        FuncionarioComum comum = new FuncionarioComum(3000.00);
        assertEquals(3000.00, comum.calcularPagamento(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarFuncionarioComSalarioNegativo() {
        new FuncionarioComum(-100.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarFuncionarioComSalarioZero() {
        new FuncionarioComum(0.0);
    }

    @Test
    public void testSetSalarioValido() {
        FuncionarioComum comum = new FuncionarioComum(3000.00);
        comum.setSalarioMensal(3500.00);
        assertEquals(3500.00, comum.getSalarioMensal(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSalarioInvalido() {
        FuncionarioComum comum = new FuncionarioComum(3000.00);
        comum.setSalarioMensal(-500.00);
    }
}
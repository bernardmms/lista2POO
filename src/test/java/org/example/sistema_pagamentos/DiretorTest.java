package org.example.sistema_pagamentos;

import org.junit.Test;
import static org.junit.Assert.*;

public class DiretorTest {

    @Test
    public void testCalcularPagamentoComLucros() {
        Diretor diretor = new Diretor(10000.00, 0.10); // 10% de participação
        double lucrosDaEmpresa = 50000.00;
        assertEquals(15000.00, diretor.calcularPagamento(lucrosDaEmpresa), 0.001);
    }

    @Test
    public void testCalcularPagamentoSemLucrosInformados() {
        Diretor diretor = new Diretor(10000.00, 0.10);
        assertEquals(10000.00, diretor.calcularPagamento(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcularPagamentoComLucrosNegativos() {
        Diretor diretor = new Diretor(10000.00, 0.10);
        diretor.calcularPagamento(-5000.00);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarDiretorComParticipacaoNegativa() {
        new Diretor(10000.00, -0.05);
    }

    @Test
    public void testCalcularPagamentoComParticipacaoZero() {
        Diretor diretor = new Diretor(10000.00, 0.0);
        double lucrosDaEmpresa = 50000.00;
        assertEquals(10000.00, diretor.calcularPagamento(lucrosDaEmpresa), 0.001);
    }
}
package org.example.sistema_bancario;

import org.junit.Test;
import static org.junit.Assert.*;

public class ContaPoupancaTest {

    @Test
    public void testDepositarSemTaxa() {
        ContaPoupanca cp = new ContaPoupanca("555-5", "Fernanda Alves", 500.0);
        cp.depositar(100.0);
        assertEquals(600.0, cp.getSaldo(), 0.001);
    }

    @Test
    public void testSacarComSaldoSuficiente() {
        ContaPoupanca cp = new ContaPoupanca("666-6", "Gabriel Santos", 1000.0);
        cp.sacar(400.0);
        assertEquals(600.0, cp.getSaldo(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSacarValorMaiorQueSaldo() {
        ContaPoupanca cp = new ContaPoupanca("777-7", "Lucas Martins", 200.0);
        cp.sacar(200.01);
    }

    @Test
    public void testCalcularJuros() {
        ContaPoupanca cp = new ContaPoupanca("888-8", "Juliana Lima", 2000.0);
        cp.calcularJuros();
        assertEquals(2010.0, cp.getSaldo(), 0.001);
    }
    
    @Test
    public void testCalcularJurosComSaldoZero() {
        ContaPoupanca cp = new ContaPoupanca("999-9", "Tiago Ferreira", 0.0);
        cp.calcularJuros();
        assertEquals(0.0, cp.getSaldo(), 0.001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCriarContaComTitularVazio() {
        new ContaPoupanca("123-0", "  ", 100.0);
    }
}
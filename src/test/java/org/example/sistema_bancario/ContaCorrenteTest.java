package org.example.sistema_bancario;

import org.junit.Test;
import static org.junit.Assert.*;

public class ContaCorrenteTest {

    @Test
    public void testDepositarComTaxa() {
        ContaCorrente cc = new ContaCorrente("123-4", "João Silva", 100.0);
        cc.depositar(50.0);
        assertEquals(149.50, cc.getSaldo(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDepositarValorMenorQueTaxa() {
        ContaCorrente cc = new ContaCorrente("123-5", "Maria Souza", 100.0);
        cc.depositar(0.50);
    }

    @Test
    public void testSacarComSaldoSuficiente() {
        ContaCorrente cc = new ContaCorrente("456-7", "Carlos Lima", 200.0);
        cc.sacar(150.0);
        assertEquals(50.0, cc.getSaldo(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSacarComSaldoInsuficiente() {
        ContaCorrente cc = new ContaCorrente("789-0", "Ana Pereira", 100.0);
        cc.sacar(100.01);
    }

    @Test
    public void testCalcularJurosComoTaxaDeManutencao() {
        ContaCorrente cc = new ContaCorrente("321-6", "Pedro Rocha", 1000.0);
        cc.calcularJuros();
        assertEquals(985.00, cc.getSaldo(), 0.001);
    }

    @Test(expected = IllegalStateException.class)
    public void testCalcularJurosSemSaldoSuficienteParaTaxa() {
        ContaCorrente cc = new ContaCorrente("111-2", "Bia Costa", 10.0);
        cc.calcularJuros();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCriarContaComSaldoNegativo() {
        new ContaCorrente("222-3", "Rui Barbosa", -50.0);
    }
}
package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContaBancariaTest {
    @Test
    void novaContaSaldoInicialZero() {
        ContaBancaria conta = new ContaBancaria();
        assertEquals(0.0, conta.getSaldo());
    }

    @Test
    void depositarAumentaSaldo() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100.0);
        assertEquals(100.0, conta.getSaldo());
    }

    @Test
    void depositarValorNegativoLancaExcecao() {
        ContaBancaria conta = new ContaBancaria();
        assertThrows(IllegalArgumentException.class, () -> conta.depositar(-50.0));
    }

    @Test
    void sacarReduzSaldo() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(200.0);
        conta.sacar(50.0);
        assertEquals(150.0, conta.getSaldo());
    }

    @Test
    void sacarValorMaiorQueSaldoLancaExcecao() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100.0);
        assertThrows(IllegalArgumentException.class, () -> conta.sacar(150.0));
    }

    @Test
    void sacarValorNegativoLancaExcecao() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100.0);
        assertThrows(IllegalArgumentException.class, () -> conta.sacar(-10.0));
    }

    @Test
    void gettersAndSettersFuncionam() {
        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("João Silva");
        conta.setNumero_conta("12345-X");

        assertEquals("João Silva", conta.getTitular());
        assertEquals("12345-X", conta.getNumero_conta());
    }

}
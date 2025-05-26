package org.example.sistema_bancario;

public class ContaPoupanca extends ContaBancaria {
    private static final double TAXA_JUROS_MENSAL = 0.005;

    public ContaPoupanca(String numeroConta, String titular, double saldoInicial) {
        super(numeroConta, titular, saldoInicial);
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser positivo.");
        }
        setSaldo(getSaldo() + valor);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser positivo.");
        }
        if (getSaldo() < valor) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
        }
        setSaldo(getSaldo() - valor);
    }

    @Override
    public void calcularJuros() {
        double juros = getSaldo() * TAXA_JUROS_MENSAL;
        setSaldo(getSaldo() + juros);
    }
}
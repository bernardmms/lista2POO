package org.example.sistema_bancario;

public class ContaCorrente extends ContaBancaria {
    private static final double TAXA_DEPOSITO = 0.50;
    private static final double TAXA_MANUTENCAO_MENSAL = 15.00;

    public ContaCorrente(String numeroConta, String titular, double saldoInicial) {
        super(numeroConta, titular, saldoInicial);
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser positivo.");
        }
        if (valor <= TAXA_DEPOSITO) {
            throw new IllegalArgumentException("O valor do depósito deve ser maior que a taxa.");
        }
        setSaldo(getSaldo() + valor - TAXA_DEPOSITO);
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
        if (getSaldo() < TAXA_MANUTENCAO_MENSAL) {
            throw new IllegalStateException("Saldo insuficiente para cobrar taxa de manutenção.");
        }
        setSaldo(getSaldo() - TAXA_MANUTENCAO_MENSAL);
    }
}
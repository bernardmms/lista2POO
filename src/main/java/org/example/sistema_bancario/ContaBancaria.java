package org.example.sistema_bancario;

public abstract class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
        if (numeroConta == null || numeroConta.trim().isEmpty()) {
            throw new IllegalArgumentException("O número da conta não pode ser nulo ou vazio.");
        }
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("O titular não pode ser nulo ou vazio.");
        }
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("O saldo inicial não pode ser negativo.");
        }
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void depositar(double valor);

    public abstract void sacar(double valor);

    public abstract void calcularJuros();
}
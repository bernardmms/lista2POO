package org.example.sistema_pagamentos;

public abstract class Funcionario {
    private double salarioMensal;

    public Funcionario(double salarioMensal) {
        if (salarioMensal <= 0) {
            throw new IllegalArgumentException("O salário mensal deve ser um valor positivo.");
        }
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal <= 0) {
            throw new IllegalArgumentException("O salário mensal deve ser um valor positivo.");
        }
        this.salarioMensal = salarioMensal;
    }

    public abstract double calcularPagamento();
}
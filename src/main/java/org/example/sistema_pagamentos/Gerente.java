package org.example.sistema_pagamentos;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(double salarioMensal, double bonus) {
        super(salarioMensal);
        if (bonus <= 0) {
            throw new IllegalArgumentException("O bônus deve ser um valor positivo.");
        }
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus <= 0) {
            throw new IllegalArgumentException("O bônus deve ser um valor positivo.");
        }
        this.bonus = bonus;
    }

    @Override
    public double calcularPagamento() {
        return getSalarioMensal() + this.bonus;
    }
}
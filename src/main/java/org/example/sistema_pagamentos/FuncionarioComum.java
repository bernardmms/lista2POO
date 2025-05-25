package org.example.sistema_pagamentos;

public class FuncionarioComum extends Funcionario {

    public FuncionarioComum(double salarioMensal) {
        super(salarioMensal);
    }

    @Override
    public double calcularPagamento() {
        return getSalarioMensal();
    }
}
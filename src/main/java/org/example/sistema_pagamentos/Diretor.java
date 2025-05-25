package org.example.sistema_pagamentos;

public class Diretor extends Funcionario {
    private double participacaoLucros;

    public Diretor(double salarioMensal, double participacaoLucros) {
        super(salarioMensal);
        if (participacaoLucros < 0) {
            throw new IllegalArgumentException("A participação nos lucros não pode ser negativa.");
        }
        this.participacaoLucros = participacaoLucros;
    }

    public double getParticipacaoLucros() {
        return participacaoLucros;
    }

    public void setParticipacaoLucros(double participacaoLucros) {
        if (participacaoLucros < 0) {
            throw new IllegalArgumentException("A participação nos lucros não pode ser negativa.");
        }
        this.participacaoLucros = participacaoLucros;
    }

    public double calcularPagamento(double lucrosEmpresa) {
        if (lucrosEmpresa < 0) {
            throw new IllegalArgumentException("Os lucros da empresa não podem ser negativos.");
        }
        return getSalarioMensal() + (lucrosEmpresa * this.participacaoLucros);
    }

    @Override
    public double calcularPagamento() {
        return getSalarioMensal();
    }
}
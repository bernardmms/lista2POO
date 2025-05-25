package org.example.sistema_pedidos;

public abstract class Produto {
    private String nome;
    private double precoBase;

    public Produto(String nome, double precoBase) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do produto não pode ser nulo ou vazio.");
        }
        if (precoBase <= 0) {
            throw new IllegalArgumentException("O preço base deve ser um valor positivo.");
        }
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        if (precoBase <= 0) {
            throw new IllegalArgumentException("O preço base deve ser um valor positivo.");
        }
        this.precoBase = precoBase;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do produto não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public abstract double calcularPreco();
}
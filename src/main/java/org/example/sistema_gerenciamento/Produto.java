package org.example.sistema_gerenciamento;

public abstract class Produto {
    private String nome;
    private double precoUnitario;
    private double quantidadeEmEstoque;

    public Produto(String nome, double precoUnitario, double quantidadeEmEstoque) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do produto não pode ser nulo ou vazio.");
        }
        if (precoUnitario <= 0) {
            throw new IllegalArgumentException("O preço unitário deve ser positivo.");
        }
        if (quantidadeEmEstoque < 0) {
            throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa.");
        }
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public double getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void baixarEstoque(double quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade para baixa de estoque deve ser positiva.");
        }
        if (this.quantidadeEmEstoque < quantidade) {
            throw new IllegalArgumentException("Estoque insuficiente para baixa.");
        }
        this.quantidadeEmEstoque -= quantidade;
    }

    public abstract double calcularPrecoTotal(double quantidadeComprada);
}
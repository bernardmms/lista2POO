package org.example.sistema_gerenciamento;

public class ProdutoAlimento extends Produto {

    public ProdutoAlimento(String nome, double precoPorQuilo, double quantidadeEmEstoqueKg) {
        super(nome, precoPorQuilo, quantidadeEmEstoqueKg);
    }

    @Override
    public double calcularPrecoTotal(double quantidadeCompradaKg) {
        if (quantidadeCompradaKg <= 0) {
            throw new IllegalArgumentException("A quantidade comprada deve ser positiva.");
        }
        if (getQuantidadeEmEstoque() < quantidadeCompradaKg) {
            throw new IllegalArgumentException("Estoque insuficiente. Disponível: " + getQuantidadeEmEstoque() + " kg");
        }

        double precoTotal = getPrecoUnitario() * quantidadeCompradaKg;
        baixarEstoque(quantidadeCompradaKg);
        return precoTotal;
    }
}
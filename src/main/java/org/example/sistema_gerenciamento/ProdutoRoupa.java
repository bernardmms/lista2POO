package org.example.sistema_gerenciamento;

public class ProdutoRoupa extends Produto {
    private double desconto; // Ex: 0.1 para 10%

    public ProdutoRoupa(String nome, double precoUnitario, int quantidadeEmEstoque, double desconto) {
        super(nome, precoUnitario, quantidadeEmEstoque);
        if (desconto < 0 || desconto > 1) {
            throw new IllegalArgumentException("O desconto deve estar entre 0 e 1.");
        }
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    @Override
    public double calcularPrecoTotal(double quantidadeComprada) {
        if (quantidadeComprada <= 0 || quantidadeComprada % 1 != 0) {
            throw new IllegalArgumentException("A quantidade comprada de roupas deve ser um número inteiro positivo.");
        }
        if (getQuantidadeEmEstoque() < quantidadeComprada) {
            throw new IllegalArgumentException("Estoque insuficiente. Disponível: " + (int)getQuantidadeEmEstoque());
        }

        double precoBruto = getPrecoUnitario() * quantidadeComprada;
        double valorDesconto = precoBruto * this.desconto;
        double precoFinal = precoBruto - valorDesconto;

        baixarEstoque(quantidadeComprada);
        return precoFinal;
    }
}
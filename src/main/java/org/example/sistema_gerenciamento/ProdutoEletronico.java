package org.example.sistema_gerenciamento;

public class ProdutoEletronico extends Produto {

    public ProdutoEletronico(String nome, double precoUnitario, int quantidadeEmEstoque) {
        super(nome, precoUnitario, quantidadeEmEstoque);
    }

    @Override
    public double calcularPrecoTotal(double quantidadeComprada) {
        if (quantidadeComprada <= 0 || quantidadeComprada % 1 != 0) {
            throw new IllegalArgumentException("A quantidade comprada de eletrônicos deve ser um número inteiro positivo.");
        }
        if (getQuantidadeEmEstoque() < quantidadeComprada) {
            throw new IllegalArgumentException("Estoque insuficiente. Disponível: " + (int)getQuantidadeEmEstoque());
        }

        double precoTotal = getPrecoUnitario() * quantidadeComprada;
        baixarEstoque(quantidadeComprada);
        return precoTotal;
    }
}
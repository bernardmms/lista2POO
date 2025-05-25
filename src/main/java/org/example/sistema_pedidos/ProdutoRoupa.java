package org.example.sistema_pedidos;

public class ProdutoRoupa extends Produto {
    private static final double DESCONTO_ROUPA = 0.20; // 20%

    public ProdutoRoupa(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPreco() {
        double desconto = getPrecoBase() * DESCONTO_ROUPA;
        return getPrecoBase() - desconto;
    }
}
package org.example.sistema_pedidos;

public class ProdutoLivro extends Produto {
    private static final double DESCONTO_LIVRO = 0.05; // 5%

    public ProdutoLivro(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPreco() {
        double desconto = getPrecoBase() * DESCONTO_LIVRO;
        return getPrecoBase() - desconto;
    }
}
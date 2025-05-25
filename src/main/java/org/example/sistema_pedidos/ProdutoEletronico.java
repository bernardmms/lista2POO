package org.example.sistema_pedidos;

public class ProdutoEletronico extends Produto {
    private static final double DESCONTO_ELETRONICO = 0.10; // 10%

    public ProdutoEletronico(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPreco() {
        double desconto = getPrecoBase() * DESCONTO_ELETRONICO;
        return getPrecoBase() - desconto;
    }
}
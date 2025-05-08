package org.example;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade_estoque = 0;
    private String categoria;

    public Produto() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Soma quantidade ao estoque; quantidade deve ser positiva.
     */
    public void adicionar_estoque(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade para adicionar deve ser positiva");
        }
        this.quantidade_estoque += quantidade;
    }

    /**
     * Remove quantidade do estoque se houver suficiente.
     */
    public void remover_estoque(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade para remover deve ser positiva");
        }
        if (quantidade > this.quantidade_estoque) {
            throw new IllegalArgumentException("Estoque insuficiente");
        }
        this.quantidade_estoque -= quantidade;
    }

    /**
     * Aplica desconto percentual ao preço (0–100).
     */
    public void aplicar_desconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Percentual de desconto inválido");
        }
        this.preco -= this.preco * (percentual / 100.0);
    }
}

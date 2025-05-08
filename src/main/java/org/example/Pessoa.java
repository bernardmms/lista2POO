package org.example;

public class Pessoa {
    private String nome;
    private int idade = 0;         // em anos
    private int altura = 0;        // em centímetros
    private double peso = 0.0;     // em quilos

    public Pessoa() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    /** Aumenta a idade em um ano. */
    public void envelhecer() {
        this.idade++;
    }

    /**
     * Cresce 1 cm se tiver menos de 21 anos.
     */
    public void crescer() {
        if (this.idade < 21) {
            this.altura++;
        }
    }

    /**
     * Ganha peso em quilos (valor deve ser positivo).
     */
    public void ganhar_peso(double quilos) {
        if (quilos <= 0) {
            throw new IllegalArgumentException("Peso a ganhar deve ser positivo");
        }
        this.peso += quilos;
    }

    /**
     * Perde peso em quilos (valor deve ser positivo e não ultrapassar o peso atual).
     */
    public void perder_peso(double quilos) {
        if (quilos <= 0) {
            throw new IllegalArgumentException("Peso a perder deve ser positivo");
        }
        if (quilos > this.peso) {
            throw new IllegalArgumentException("Não é possível perder mais peso do que o atual");
        }
        this.peso -= quilos;
    }
}

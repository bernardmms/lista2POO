package org.example.sistema_veiculos;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private double precoBase;

    public Veiculo(String marca, String modelo, double precoBase) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("A marca não pode ser nula ou vazia.");
        }
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("O modelo não pode ser nulo ou vazio.");
        }
        if (precoBase <= 0) {
            throw new IllegalArgumentException("O preço base deve ser um valor positivo.");
        }
        this.marca = marca;
        this.modelo = modelo;
        this.precoBase = precoBase;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public abstract double calcularCusto();
}
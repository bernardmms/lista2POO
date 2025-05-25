package org.example.sistema_passagens;

import java.time.LocalDate;

public abstract class Voo {
    private String origem;
    private String destino;
    private double distancia;
    private LocalDate data;

    public Voo(String origem, String destino, double distancia, LocalDate data) {
        if (origem == null || origem.trim().isEmpty()) {
            throw new IllegalArgumentException("A origem não pode ser nula ou vazia.");
        }
        if (destino == null || destino.trim().isEmpty()) {
            throw new IllegalArgumentException("O destino não pode ser nulo ou vazio.");
        }
        if (distancia <= 0) {
            throw new IllegalArgumentException("A distância deve ser um valor positivo.");
        }
        if (data == null) {
            throw new IllegalArgumentException("A data do voo não pode ser nula.");
        }
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
        this.data = data;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public LocalDate getData() {
        return data;
    }

    public abstract double calcularPreco();
}
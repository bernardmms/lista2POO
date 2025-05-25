package org.example.sistema_passagens;

import java.time.LocalDate;

public class VooDomestico extends Voo {
    private static final double FATOR_PRECO_DOMESTICO = 0.5;

    public VooDomestico(String origem, String destino, double distancia, LocalDate data) {
        super(origem, destino, distancia, data);
    }

    @Override
    public double calcularPreco() {
        return getDistancia() * FATOR_PRECO_DOMESTICO;
    }
}
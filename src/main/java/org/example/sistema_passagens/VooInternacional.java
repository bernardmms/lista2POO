package org.example.sistema_passagens;

import java.time.LocalDate;

public class VooInternacional extends Voo {
    private static final double FATOR_PRECO_INTERNACIONAL = 1.2;
    private static final double TAXA_CONVERSAO_MOEDA = 100.0;

    public VooInternacional(String origem, String destino, double distancia, LocalDate data) {
        super(origem, destino, distancia, data);
    }

    @Override
    public double calcularPreco() {
        return (getDistancia() * FATOR_PRECO_INTERNACIONAL) + TAXA_CONVERSAO_MOEDA;
    }
}
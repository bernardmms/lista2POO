package org.example.sistema_veiculos;

public class Carro extends Veiculo {
    private static final double FATOR_CUSTO_CARRO = 1.25;

    public Carro(String marca, String modelo, double precoBase) {
        super(marca, modelo, precoBase);
    }

    @Override
    public double calcularCusto() {
        return getPrecoBase() * FATOR_CUSTO_CARRO;
    }
}
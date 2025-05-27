package org.example.sistema_veiculos;

public class Bicicleta extends Veiculo {
    private static final double FATOR_CUSTO_BICICLETA = 1.05;

    public Bicicleta(String marca, String modelo, double precoBase) {
        super(marca, modelo, precoBase);
    }

    @Override
    public double calcularCusto() {
        return getPrecoBase() * FATOR_CUSTO_BICICLETA;
    }
}
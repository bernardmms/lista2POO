package org.example.sistema_veiculos;

public class Moto extends Veiculo {
    private static final double FATOR_CUSTO_MOTO = 1.10;

    public Moto(String marca, String modelo, double precoBase) {
        super(marca, modelo, precoBase);
    }

    @Override
    public double calcularCusto() {
        return getPrecoBase() * FATOR_CUSTO_MOTO;
    }
}
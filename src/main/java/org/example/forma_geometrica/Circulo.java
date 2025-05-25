package org.example.forma_geometrica;

public class Circulo extends FormaGeometrica {
    private double raio;
    private double area;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio <= 0 ) {
            throw new IllegalArgumentException("O raio não pode ser negativo ou nulo.");
        }
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        if (area <= 0 ) {
            throw new IllegalArgumentException("A area não pode ser negativa ou nula.");
        }
        this.area = area;
    }

    @Override
    public double calcularArea() {
        double raio_ao_quadrado = Math.pow(this.raio, 2);

        return Math.PI * raio_ao_quadrado * 100. / 100.; // arredonda para duas casas decimais
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * this.raio * 200. / 100; // arredonda para duas casas decimais
    }
}
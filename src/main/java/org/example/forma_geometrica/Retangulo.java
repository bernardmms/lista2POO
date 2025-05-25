package org.example.forma_geometrica;

public class Retangulo extends FormaGeometrica {
    private double altura;
    private double largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if ( altura <= 0) {
            throw new IllegalArgumentException("A altura não pode ser nula ou negativa");
        }
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if ( largura <= 0) {
            throw new IllegalArgumentException("A largura não pode ser nula ou negativa");
        }
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return this.altura * this.largura * 100. / 100.; // arredonda para duas casas decimais
    }

    @Override
    public double calcularPerimetro() {
        return ((this.altura * 2) + (this.largura * 2)) * 100. / 100. ; // arredonda para duas casas decimais
    }
}
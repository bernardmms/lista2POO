package org.example;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade_atual = 0;
    private boolean estado = false;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidade_atual() {
        return velocidade_atual;
    }

    public void setVelocidade_atual(int velocidade_atual) {
        this.velocidade_atual = velocidade_atual;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public Carro() {
        this.velocidade_atual = 0;
        this.estado = false;
    }

    public void acelerar(int velocidade) {
        if (velocidade < 0) {
            throw new IllegalArgumentException("Aceleração negativa");
        }
        this.velocidade_atual += velocidade;
    }

    public void frear(int velocidade) {
        if (velocidade < 0) {
            throw new IllegalArgumentException("A frenagem não pode ser negativa");
        }
        if (velocidade > this.velocidade_atual) {
            this.velocidade_atual = 0;
            return;
        }

        this.velocidade_atual -= velocidade;
    }

    public void ligar() {
        this.estado = true;
    }

    public void desligar() {
        this.estado = false;
        this.velocidade_atual = 0;
    }
}

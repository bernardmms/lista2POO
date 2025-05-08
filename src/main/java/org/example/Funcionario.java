package org.example;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private String departamento;

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void receber_aumento(double percentual) {
        if (percentual < 0) {
            throw new IllegalArgumentException("Percentual não pode ser negativo");
        }
        this.salario += this.salario * (percentual / 100.0);
    }

    public void mudar_departamento(String novo_departamento) {
        this.departamento = novo_departamento;
    }

    public void exibir_dados() {
        System.out.println(
                "Nome: " + nome +
                        ", Cargo: " + cargo +
                        ", Salário: " + salario +
                        ", Departamento: " + departamento);
    }
}

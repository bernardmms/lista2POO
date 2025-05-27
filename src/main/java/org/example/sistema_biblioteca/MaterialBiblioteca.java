package org.example.sistema_biblioteca;

import java.time.LocalDate;

public abstract class MaterialBiblioteca {
    private String titulo;
    private LocalDate dataPublicacao;

    public MaterialBiblioteca(String titulo, LocalDate dataPublicacao) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O título não pode ser nulo ou vazio.");
        }
        if (dataPublicacao == null) {
            throw new IllegalArgumentException("A data de publicação não pode ser nula.");
        }
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public abstract LocalDate calcularDataDevolucao(LocalDate dataEmprestimo);
}
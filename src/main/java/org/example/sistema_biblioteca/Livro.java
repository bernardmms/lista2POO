package org.example.sistema_biblioteca;

import java.time.LocalDate;

public class Livro extends MaterialBiblioteca {
    private static final int PRAZO_EMPRESTIMO_DIAS = 15;

    public Livro(String titulo, LocalDate dataPublicacao) {
        super(titulo, dataPublicacao);
    }

    @Override
    public LocalDate calcularDataDevolucao(LocalDate dataEmprestimo) {
        if (dataEmprestimo == null) {
            throw new IllegalArgumentException("A data de empréstimo não pode ser nula.");
        }
        return dataEmprestimo.plusDays(PRAZO_EMPRESTIMO_DIAS);
    }
}
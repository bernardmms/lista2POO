package org.example;

public class Livro {
    private String titulo;
    private String autor;
    private int ano_publicacao;
    private int numero_paginas;
    private String genero;

    private int pagina_atual = 1;
    private int pagina_marcada = 1;

    public Livro() {}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno_publicacao() {
        return ano_publicacao;
    }

    public void setAno_publicacao(int ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPagina_atual() {
        return pagina_atual;
    }

    public int getPagina_marcada() {
        return pagina_marcada;
    }

    public void abrir() {
        System.out.println("Livro aberto.");
    }

    public void fechar() {
        System.out.println("Livro fechado.");
    }

    public void marcar_pagina(int pagina) {
        if (pagina < 1 || pagina > numero_paginas) {
            throw new IllegalArgumentException("Página inválida");
        }
        this.pagina_marcada = pagina;
    }

    public void avancar_pagina() {
        if (pagina_atual < numero_paginas) {
            pagina_atual++;
        }
    }

    public void retroceder_pagina() {
        if (pagina_atual > 1) {
            pagina_atual--;
        }
    }
}

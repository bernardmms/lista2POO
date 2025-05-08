// src/test/java/org/example/LivroTest.java
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    @Test
    void atributosEGettersSetters() {
        Livro liv = new Livro();
        liv.setTitulo("1984");
        liv.setAutor("George Orwell");
        liv.setAno_publicacao(1949);
        liv.setNumero_paginas(328);
        liv.setGenero("Distopia");

        assertEquals("1984", liv.getTitulo());
        assertEquals("George Orwell", liv.getAutor());
        assertEquals(1949, liv.getAno_publicacao());
        assertEquals(328, liv.getNumero_paginas());
        assertEquals("Distopia", liv.getGenero());
    }

    @Test
    void abrirFecharNaoLancamExcecao() {
        Livro liv = new Livro();
        liv.abrir();
        liv.fechar();
    }

    @Test
    void paginaInicialEOHomeMark() {
        Livro liv = new Livro();
        liv.setNumero_paginas(100);
        assertEquals(1, liv.getPagina_atual());
        assertEquals(1, liv.getPagina_marcada());
    }

    @Test
    void marcarPaginaValida() {
        Livro liv = new Livro();
        liv.setNumero_paginas(200);
        liv.marcar_pagina(50);
        assertEquals(50, liv.getPagina_marcada());
    }

    @Test
    void marcarPaginaInvalidaLancaExcecao() {
        Livro liv = new Livro();
        liv.setNumero_paginas(100);
        assertThrows(IllegalArgumentException.class, () -> liv.marcar_pagina(0));
        assertThrows(IllegalArgumentException.class, () -> liv.marcar_pagina(101));
    }

    @Test
    void avancarPaginaLimite() {
        Livro liv = new Livro();
        liv.setNumero_paginas(3);
        liv.avancar_pagina();
        assertEquals(2, liv.getPagina_atual());
        liv.avancar_pagina();
        assertEquals(3, liv.getPagina_atual());
        liv.avancar_pagina();
        assertEquals(3, liv.getPagina_atual());
    }

    @Test
    void retrocederPaginaLimite() {
        Livro liv = new Livro();
        liv.setNumero_paginas(5);
        // página atual = 1
        liv.retroceder_pagina();
        assertEquals(1, liv.getPagina_atual());
        // avança e retrocede
        liv.avancar_pagina(); // 2
        liv.retroceder_pagina();
        assertEquals(1, liv.getPagina_atual());
    }
}

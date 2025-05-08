package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    void atributosEGettersSetters() {
        Pessoa p = new Pessoa();
        p.setNome("Maria");
        p.setIdade(20);
        p.setAltura(160);
        p.setPeso(55.5);

        assertEquals("Maria", p.getNome());
        assertEquals(20, p.getIdade());
        assertEquals(160, p.getAltura());
        assertEquals(55.5, p.getPeso());
    }

    @Test
    void envelhecerIncrementaIdade() {
        Pessoa p = new Pessoa();
        p.setIdade(30);
        p.envelhecer();
        assertEquals(31, p.getIdade());
    }

    @Test
    void crescerAbaixoDe21Anos() {
        Pessoa p = new Pessoa();
        p.setIdade(20);
        p.setAltura(150);
        p.crescer();
        assertEquals(151, p.getAltura());
    }

    @Test
    void naoCrescerAos21OuMais() {
        Pessoa p = new Pessoa();
        p.setIdade(21);
        p.setAltura(170);
        p.crescer();
        assertEquals(170, p.getAltura());

        p.setIdade(25);
        p.crescer();
        assertEquals(170, p.getAltura());
    }

    @Test
    void ganharPesoValido() {
        Pessoa p = new Pessoa();
        p.setPeso(60.0);
        p.ganhar_peso(5.5);
        assertEquals(65.5, p.getPeso());
    }

    @Test
    void ganharPesoNegativoLancaExcecao() {
        Pessoa p = new Pessoa();
        assertThrows(IllegalArgumentException.class, () -> p.ganhar_peso(-2.0));
    }

    @Test
    void perderPesoValido() {
        Pessoa p = new Pessoa();
        p.setPeso(70.0);
        p.perder_peso(10.0);
        assertEquals(60.0, p.getPeso());
    }

    @Test
    void perderPesoNegativoLancaExcecao() {
        Pessoa p = new Pessoa();
        p.setPeso(50.0);
        assertThrows(IllegalArgumentException.class, () -> p.perder_peso(-3.0));
    }

    @Test
    void perderMaisPesoQueTemLancaExcecao() {
        Pessoa p = new Pessoa();
        p.setPeso(40.0);
        assertThrows(IllegalArgumentException.class, () -> p.perder_peso(45.0));
    }
}

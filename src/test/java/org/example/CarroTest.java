package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {
    @Test
    void carroIniciaDesligadoEVelocidadeZero() {
        Carro carro = new Carro();
        assertFalse(carro.isEstado());
        assertEquals(0, carro.getVelocidade_atual());
    }

    @Test
    void ligarEDesligarCarro() {
        Carro carro = new Carro();
        carro.ligar();
        assertTrue(carro.isEstado());

        carro.desligar();
        assertFalse(carro.isEstado());
        assertEquals(0, carro.getVelocidade_atual());
    }

    @Test
    void acelerarAumentaVelocidade() {
        Carro carro = new Carro();
        carro.acelerar(50);
        assertEquals(50, carro.getVelocidade_atual());
    }

    @Test
    void acelerarComValorNegativoLancaExcecao() {
        Carro carro = new Carro();
        assertThrows(IllegalArgumentException.class, () -> carro.acelerar(-10));
    }

    @Test
    void frearComValorMaiorQueVelocidadeZeraVelocidade() {
        Carro carro = new Carro();
        carro.acelerar(20);
        carro.frear(30);

        assertEquals(0, carro.getVelocidade_atual());
    }

    @Test
    void frearReduzVelocidadeCorretamente() {
        Carro carro = new Carro();
        carro.acelerar(50);
        carro.frear(20);
        assertEquals(30, carro.getVelocidade_atual());
    }

}

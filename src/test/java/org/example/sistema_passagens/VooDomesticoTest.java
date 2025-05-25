package org.example.sistema_passagens;

import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;

public class VooDomesticoTest {

    @Test
    public void testCalcularPrecoVooDomestico() {
        Voo voo = new VooDomestico("São Paulo", "Rio de Janeiro", 400, LocalDate.now());
        assertEquals(200.0, voo.calcularPreco(), 0.001);
    }

    @Test
    public void testCalcularPrecoComDistanciaDiferente() {
        Voo voo = new VooDomestico("Belo Horizonte", "Salvador", 1500, LocalDate.now());
        assertEquals(750.0, voo.calcularPreco(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarVooComDistanciaNegativa() {
        new VooDomestico("Curitiba", "Porto Alegre", -700, LocalDate.now());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarVooComOrigemVazia() {
        new VooDomestico("  ", "Recife", 2000, LocalDate.now());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarVooComDestinoNulo() {
        new VooDomestico("Fortaleza", null, 2200, LocalDate.now());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarVooComDataNula() {
        new VooDomestico("Manaus", "Belém", 1300, null);
    }
}
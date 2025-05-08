package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    @Test
    void gettersAndSettersFuncionam() {
        Funcionario f = new Funcionario();
        f.setNome("Ana");
        f.setCargo("Analista");
        f.setSalario(3000.0);
        f.setDepartamento("TI");

        assertEquals("Ana", f.getNome());
        assertEquals("Analista", f.getCargo());
        assertEquals(3000.0, f.getSalario());
        assertEquals("TI", f.getDepartamento());
    }

    @Test
    void receberAumentoAjustaSalario() {
        Funcionario f = new Funcionario();
        f.setSalario(2000.0);
        f.receber_aumento(10.0);
        assertEquals(2200.0, f.getSalario(), 0.0001);
    }

    @Test
    void receberAumentoZeroMantemSalario() {
        Funcionario f = new Funcionario();
        f.setSalario(1500.0);
        f.receber_aumento(0.0);
        assertEquals(1500.0, f.getSalario(), 0.0001);
    }

    @Test
    void receberAumentoNegativoLancaExcecao() {
        Funcionario f = new Funcionario();
        f.setSalario(1000.0);
        assertThrows(IllegalArgumentException.class, () -> f.receber_aumento(-5.0));
    }

    @Test
    void mudarDepartamentoAtualizaCampo() {
        Funcionario f = new Funcionario();
        f.setDepartamento("Financeiro");
        f.mudar_departamento("Marketing");
        assertEquals("Marketing", f.getDepartamento());
    }

    @Test
    void exibirDadosNaoLançaExcecao() {
        Funcionario f = new Funcionario();
        f.setNome("Bruno");
        f.setCargo("Gerente");
        f.setSalario(5000.0);
        f.setDepartamento("Vendas");
        f.exibir_dados();
    }
}

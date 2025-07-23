package TesteEntities;

import org.example.entities.FormaPagamento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteFormaDePagamento {

    private FormaPagamento formaPagamento;

    @BeforeEach
    void setUp() {
        // Inicializa a classe antes de cada teste
        formaPagamento = new FormaPagamento();
    }

    @Test
    void testSetGetFpgId() {
        formaPagamento.setFpgId(1L);
        assertEquals(1L, formaPagamento.getFpgId());
    }

    @Test
    void testSetGetFpgDescricao() {
        formaPagamento.setFpgDescricao("Cartão de Crédito");
        assertEquals("Cartão de Crédito", formaPagamento.getFpgDescricao());
    }

    @Test
    void testSetGetFpgAtivo() {
        formaPagamento.setFpgAtivo("Sim");
        assertEquals("Sim", formaPagamento.getFpgAtivo());
    }

    @Test
    void testSetGetFpgPermiteParcelamento() {
        formaPagamento.setFpgPermiteParcelamento("Sim");
        assertEquals("Sim", formaPagamento.getFpgPermiteParcelamento());
    }

    @Test
    void testSetGetFpgNumeroMaximoParcela() {
        formaPagamento.setFpgNumeroMaximoParcela(12);
        assertEquals(12, formaPagamento.getFpgNumeroMaximoParcela());
    }

    @Test
    void testSetGetFpgTaxaAdicional() {
        formaPagamento.setFpgTaxaAdicional("5%");
        assertEquals("5%", formaPagamento.getFpgTaxaAdicional());
    }
}

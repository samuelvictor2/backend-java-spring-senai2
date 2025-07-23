package TesteEntities;

import org.example.entities.Endereco;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteEndereco {

    private Endereco endereco;

    @BeforeEach
    void setUp() {
        // Inicializa a classe antes de cada teste
        endereco = new Endereco();
    }

    @Test
    void testSetGetEndId() {
        endereco.setEndId(1L);
        assertEquals(1L, endereco.getEndId());
    }

    @Test
    void testSetGetEndRua() {
        endereco.setEndRua("Rua das Palmeiras");
        assertEquals("Rua das Palmeiras", endereco.getEndRua());
    }

    @Test
    void testSetGetEndNumero() {
        endereco.setEndNumero("123");
        assertEquals("123", endereco.getEndNumero());
    }

    @Test
    void testSetGetEndCidade() {
        endereco.setEndCidade("São Paulo");
        assertEquals("São Paulo", endereco.getEndCidade());
    }

    @Test
    void testSetGetEndCep() {
        endereco.setEndCep("12345-678");
        assertEquals("12345-678", endereco.getEndCep());
    }

    @Test
    void testSetGetEndEstado() {
        endereco.setEndEstado("SP");
        assertEquals("SP", endereco.getEndEstado());
    }
}

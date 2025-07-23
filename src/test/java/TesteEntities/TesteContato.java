package TesteEntities;

import org.example.entities.Cliente;
import org.example.entities.Contato;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteContato {

    private Contato contato;

    @BeforeEach
    void setUp() {
        // Inicializa a classe antes de cada teste
        contato = new Contato();
    }

    @Test
    void testSetGetConId() {
        contato.setConId(1L);
        assertEquals(1L, contato.getConId());
    }

    @Test
    void testSetGetConCelular() {
        contato.setConCelular("(11) 91234-5678");
        assertEquals("(11) 91234-5678", contato.getConCelular());
    }

    @Test
    void testSetGetConTelefoneComercial() {
        contato.setConTelefoneComercial("(11) 3321-1234");
        assertEquals("(11) 3321-1234", contato.getConTelefoneComercial());
    }

    @Test
    void testSetGetConEmail() {
        contato.setConEmail("contato@cliente.com");
        assertEquals("contato@cliente.com", contato.getConEmail());
    }

    @Test
    void testSetGetConCliente() {
        Cliente cliente = new Cliente();
        cliente.setCliNome("João da Silva");
        contato.setConCliente(cliente);

        assertEquals("João da Silva", contato.getConCliente().getCliNome());
    }
}

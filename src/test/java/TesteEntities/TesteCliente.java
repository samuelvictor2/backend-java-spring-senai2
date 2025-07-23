package TesteEntities;

import org.example.entities.Cliente;
import org.example.entities.Contato;
import org.example.entities.Endereco;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteCliente {

    private Cliente cliente;

    @BeforeEach
    void setUp() {
        // Inicializa a classe antes de cada teste
        cliente = new Cliente();
    }

    @Test
    void testSetGetCliId() {
        cliente.setCliId(1L);
        assertEquals(1L, cliente.getCliId());
    }

    @Test
    void testSetGetCliNome() {
        cliente.setCliNome("João da Silva");
        assertEquals("João da Silva", cliente.getCliNome());
    }

    @Test
    void testSetGetCliCpf() {
        cliente.setCliCpf("12345678901");
        assertEquals("12345678901", cliente.getCliCpf());
    }

    @Test
    void testSetGetEnderecos() {
        Endereco endereco = new Endereco();
        endereco.setEndRua("Rua das Flores");
        cliente.setEnderecos(List.of(endereco));

        assertEquals(1, cliente.getEnderecos().size());
        assertEquals("Rua das Flores", cliente.getEnderecos().get(0).getEndRua());
    }

    @Test
    void testSetGetContatos() {
        Contato contato = new Contato();
        contato.setConCelular("(11) 91234-5678");
        cliente.setContatos(List.of(contato));

        assertEquals(1, cliente.getContatos().size());
        assertEquals("(11) 91234-5678", cliente.getContatos().get(0).getConCelular());
    }
}

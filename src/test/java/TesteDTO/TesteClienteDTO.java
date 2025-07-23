package TesteDTO;

import org.example.dto.ClienteDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteClienteDTO {
    private ClienteDTO clienteDTO;

        @BeforeEach
        void setUp() {
            // Inicializa a classe antes de cada teste
            clienteDTO = new ClienteDTO();
        }

        @Test
        void testSetGetCliId() {
            clienteDTO.setCliId(1L);
            assertEquals(1L, clienteDTO.getCliId());
        }

        @Test
        void testSetGetCliNome() {
            clienteDTO.setCliNome("João Silva");
            assertEquals("João Silva", clienteDTO.getCliNome());
        }

        @Test
        void testSetGetCliCpf() {
            clienteDTO.setCliCpf("123.456.789-00");
            assertEquals("123.456.789-00", clienteDTO.getCliCpf());
        }

        @Test
        void testSetGetEndRua() {
            clienteDTO.setEndRua("Rua das Flores");
            assertEquals("Rua das Flores", clienteDTO.getEndRua());
        }

        @Test
        void testSetGetEndNumero() {
            clienteDTO.setEndNumero("123");
            assertEquals("123", clienteDTO.getEndNumero());
        }

        @Test
        void testSetGetEndCidade() {
            clienteDTO.setEndCidade("São Paulo");
            assertEquals("São Paulo", clienteDTO.getEndCidade());
        }

        @Test
        void testSetGetEndCep() {
            clienteDTO.setEndCep("12345-678");
            assertEquals("12345-678", clienteDTO.getEndCep());
        }

        @Test
        void testSetGetEndEstado() {
            clienteDTO.setEndEstado("SP");
            assertEquals("SP", clienteDTO.getEndEstado());
        }

        @Test
        void testSetGetConCelular() {
            clienteDTO.setConCelular("(11) 91234-5678");
            assertEquals("(11) 91234-5678", clienteDTO.getConCelular());
        }

        @Test
        void testSetGetConEmail() {
            clienteDTO.setConEmail("joao.silva@example.com");
            assertEquals("joao.silva@example.com", clienteDTO.getConEmail());
        }

        @Test
        void testSetGetConTelefoneComercial() {
            clienteDTO.setConTelefoneComercial("(11) 3321-1234");
            assertEquals("(11) 3321-1234", clienteDTO.getConTelefoneComercial());
        }
    }



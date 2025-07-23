package TesteDTO;

import org.example.dto.FornecedorDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteFornecedorDTO {

    private FornecedorDTO fornecedorDTO;

    @BeforeEach
    void setUp() {
        // Inicializa a classe antes de cada teste
        fornecedorDTO = new FornecedorDTO();
    }

    @Test
    void testSetGetForId() {
        fornecedorDTO.setForId(1L);
        assertEquals(1L, fornecedorDTO.getForId());
    }

    @Test
    void testSetGetForNomeFantasia() {
        fornecedorDTO.setForNomeFantasia("Fornecedor XYZ");
        assertEquals("Fornecedor XYZ", fornecedorDTO.getForNomeFantasia());
    }

    @Test
    void testSetGetForCnpj() {
        fornecedorDTO.setForCnpj("12.345.678/0001-90");
        assertEquals("12.345.678/0001-90", fornecedorDTO.getForCnpj());
    }

    @Test
    void testSetGetForRazaoSocial() {
        fornecedorDTO.setForRazaoSocial("Razão Social XYZ Ltda.");
        assertEquals("Razão Social XYZ Ltda.", fornecedorDTO.getForRazaoSocial());
    }

    @Test
    void testSetGetEndRua() {
        fornecedorDTO.setEndRua("Rua dos Fornecedores");
        assertEquals("Rua dos Fornecedores", fornecedorDTO.getEndRua());
    }

    @Test
    void testSetGetEndNumero() {
        fornecedorDTO.setEndNumero("100");
        assertEquals("100", fornecedorDTO.getEndNumero());
    }

    @Test
    void testSetGetEndCidade() {
        fornecedorDTO.setEndCidade("São Paulo");
        assertEquals("São Paulo", fornecedorDTO.getEndCidade());
    }

    @Test
    void testSetGetEndCep() {
        fornecedorDTO.setEndCep("12345-678");
        assertEquals("12345-678", fornecedorDTO.getEndCep());
    }

    @Test
    void testSetGetEndEstado() {
        fornecedorDTO.setEndEstado("SP");
        assertEquals("SP", fornecedorDTO.getEndEstado());
    }

    @Test
    void testSetGetConCelular() {
        fornecedorDTO.setConCelular("(11) 91234-5678");
        assertEquals("(11) 91234-5678", fornecedorDTO.getConCelular());
    }

    @Test
    void testSetGetConEmail() {
        fornecedorDTO.setConEmail("fornecedor@xyz.com");
        assertEquals("fornecedor@xyz.com", fornecedorDTO.getConEmail());
    }

    @Test
    void testSetGetConTelefoneComercial() {
        fornecedorDTO.setConTelefoneComercial("(11) 3321-1234");
        assertEquals("(11) 3321-1234", fornecedorDTO.getConTelefoneComercial());
    }
}

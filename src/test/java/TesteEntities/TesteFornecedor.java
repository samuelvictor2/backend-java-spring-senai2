package TesteEntities;

import org.example.entities.Fornecedor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class TesteFornecedor {

    private Validator validator;

    @BeforeEach
    void setUp() {
        // Criando o validador para validar as anotações de restrição
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    void testFornecedorValid() {
        Fornecedor fornecedor = new Fornecedor(1L, "Loja ABC", "12.345.678/0001-99", "ABC Comércio Ltda");

        Set<javax.validation.ConstraintViolation<Fornecedor>> violations = validator.validate(fornecedor);

        assertTrue(violations.isEmpty(), "Não deve haver violações de validação");
    }

    @Test
    void testFornecedorCnpjInvalido() {
        Fornecedor fornecedor = new Fornecedor(1L, "Loja XYZ", "12.345.678/0001-00", "XYZ Comércio Ltda");

        Set<javax.validation.ConstraintViolation<Fornecedor>> violations = validator.validate(fornecedor);

        assertFalse(violations.isEmpty(), "CNPJ inválido deve gerar erro de validação");
    }
}

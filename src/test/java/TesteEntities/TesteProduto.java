package TesteEntities;

import org.example.entities.Produto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.time.LocalDateTime;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class TesteProduto {

    private Validator validator;

    @BeforeEach
    void setUp() {
        // Criando o validador
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    void testProdutoValid() {
        Produto produto = new Produto(1L, "Produto A", 50.0, 75.0, 10, "Categoria A", "1234567890123", "Marca A", "Unidade", "Sim", LocalDateTime.now(), LocalDateTime.now());

        Set<javax.validation.ConstraintViolation<Produto>> violations = validator.validate(produto);

        assertTrue(violations.isEmpty(), "Não deve haver violações de validação");
    }

    @Test
    void testPrecoCustoNegativo() {
        Produto produto = new Produto(1L, "Produto B", -10.0, 80.0, 5, "Categoria B", "1234567890124", "Marca B", "Unidade", "Sim", LocalDateTime.now(), LocalDateTime.now());

        Set<javax.validation.ConstraintViolation<Produto>> violations = validator.validate(produto);

        assertFalse(violations.isEmpty(), "Preço de custo não pode ser negativo");
    }

    @Test
    void testQuantidadeEstoqueNegativa() {
        Produto produto = new Produto(1L, "Produto C", 10.0, 15.0, -5, "Categoria C", "1234567890125", "Marca C", "Unidade", "Sim", LocalDateTime.now(), LocalDateTime.now());

        Set<javax.validation.ConstraintViolation<Produto>> violations = validator.validate(produto);

        assertFalse(violations.isEmpty(), "Quantidade em estoque não pode ser negativa");
    }
}

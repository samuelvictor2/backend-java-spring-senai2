package TesteDTO;

import org.example.dto.VendaDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteVendaDTO {

    private VendaDTO vendaDTO;

    @BeforeEach
    void setUp() {
        // Inicializa a classe antes de cada teste
        vendaDTO = new VendaDTO();
    }

    @Test
    void testSetGetClienteId() {
        vendaDTO.setClienteId(1L);
        assertEquals(1L, vendaDTO.getClienteId());
    }

    @Test
    void testSetGetItens() {
        // Criando um ItemVendaDTO para testar
        VendaDTO.ItemVendaDTO item = new VendaDTO.ItemVendaDTO();
        item.setProdutoId(101L);
        item.setQuantidade(2);

        // Adicionando o item à lista de itens
        vendaDTO.setItens(List.of(item));

        assertEquals(1, vendaDTO.getItens().size());
        assertEquals(101L, vendaDTO.getItens().get(0).getProdutoId());
        assertEquals(2, vendaDTO.getItens().get(0).getQuantidade());
    }
}

package TesteEntities;

import org.example.entities.ItemVenda;
import org.example.entities.Produto;
import org.example.entities.Venda;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TesteItemVenda {

    @Test
    void testCalculaSubtotal() {
        Produto produto = new Produto(1L, "Produto A", 50.0, 75.0, 10, "Categoria A", "1234567890123", "Marca A", "Unidade", "Sim", LocalDateTime.now(), LocalDateTime.now());
        Venda venda = new Venda();
        venda.setId(1L);
        venda.setData(LocalDate.now());
        venda.setValorTotal(0.0);

        ItemVenda itemVenda = new ItemVenda();
        itemVenda.setVenda(venda);
        itemVenda.setProduto(produto);
        itemVenda.setQuantidade(3);
        itemVenda.setPrecoUnitario(75.0);
        itemVenda.setSubtotal(itemVenda.getPrecoUnitario() * itemVenda.getQuantidade());

        assertEquals(225.0, itemVenda.getSubtotal(), "Subtotal deve ser igual à quantidade vezes o preço unitário");
    }

    @Test
    void testItemVendaComProdutoInvalido() {
        Produto produtoInvalido = null; // Produto não atribuído
        Venda venda = new Venda();
        ItemVenda itemVenda = new ItemVenda();

        itemVenda.setVenda(venda);
        itemVenda.setProduto(produtoInvalido);
        itemVenda.setQuantidade(3);
        itemVenda.setPrecoUnitario(75.0);

        assertNull(itemVenda.getProduto(), "Produto não pode ser nulo");
    }
}

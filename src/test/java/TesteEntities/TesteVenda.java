package TesteEntities;

import org.example.entities.Produto;
import org.example.entities.Venda;
import org.example.entities.Cliente;
import org.example.entities.ItemVenda;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TesteVenda {

    @Test
    void testVendaValid() {
        Cliente cliente = new Cliente();
        cliente.setCliId(1L);
        cliente.setCliNome("Cliente A");

        Venda venda = new Venda();
        venda.setId(1L);
        venda.setCliente(cliente);
        venda.setData(LocalDate.now());
        venda.setValorTotal(0.0);

        assertEquals(1L, venda.getCliente().getCliId(), "Venda deve estar associada a um cliente válido");
    }

    @Test
    void testVendaComItens() {
        Cliente cliente = new Cliente();
        cliente.setCliId(1L);
        cliente.setCliNome("Cliente B");

        Venda venda = new Venda();
        venda.setId(1L);
        venda.setCliente(cliente);
        venda.setData(LocalDate.now());

        Produto produto = new Produto(1L, "Produto A", 50.0, 75.0, 10, "Categoria A", "1234567890123", "Marca A", "Unidade", "Sim", LocalDateTime.now(), LocalDateTime.now());

        ItemVenda itemVenda = new ItemVenda();
        itemVenda.setVenda(venda);
        itemVenda.setProduto(produto);
        itemVenda.setQuantidade(3);
        itemVenda.setPrecoUnitario(75.0);
        itemVenda.setSubtotal(itemVenda.getPrecoUnitario() * itemVenda.getQuantidade());

        venda.getItens().add(itemVenda);

        assertEquals(1, venda.getItens().size(), "Venda deve ter itens associados");
        assertEquals(225.0, venda.getItens().get(0).getSubtotal(), "Subtotal do item de venda deve ser calculado corretamente");
    }
}

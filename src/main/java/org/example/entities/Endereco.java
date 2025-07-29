package org.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "END_ID")
    private Long endId;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "END_CLI_ID")
    private Cliente endCliente;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "END_FORN_ID")
    private Fornecedor endFornecedor;

    @NotBlank(message = "Rua é obrigatória")
    @Size(max = 150, message = "Rua deve ter no máximo 150 caracteres")
    @Column(name = "END_RUA")
    private String endRua;

    @NotBlank(message = "Número é obrigatório")
    @Size(max = 5, message = "Número deve ter no máximo 5 caracteres")
    @Column(name = "END_NUMERO")
    private String endNumero;

    @NotBlank(message = "Cidade é obrigatória")
    @Size(max = 100, message = "Cidade deve ter no máximo 100 caracteres")
    @Column(name = "END_CIDADE")
    private String endCidade;

    @NotBlank(message = "CEP é obrigatório")
    @Size(max = 9, message = "CEP deve ter no máximo 10 caracteres")
    @Column(name = "END_CEP", length = 9)
    private String endCep;

    @NotBlank(message = "Estado é obrigatório")
    @Size(max = 2, message = "Estado deve ter no máximo 2 caracteres")
    @Column(name = "END_ESTADO", length = 2)
    private String endEstado;

    public Endereco() {
    }

    public Endereco(Long endId, Cliente endCliente, Fornecedor endFornecedor, String endRua, String endNumero, String endCidade, String endCep, String endEstado) {
        this.endId = endId;
        this.endCliente = endCliente;
        this.endFornecedor = endFornecedor;
        this.endRua = endRua;
        this.endNumero = endNumero;
        this.endCidade = endCidade;
        this.endCep = endCep;
        this.endEstado = endEstado;
    }

    public Long getEndId() {
        return endId;
    }

    public void setEndId(Long endId) {
        this.endId = endId;
    }

    public Cliente getEndCliente() {
        return endCliente;
    }

    public void setEndCliente(Cliente endCliente) {
        this.endCliente = endCliente;
    }

    public Fornecedor getEndFornecedor() {
        return endFornecedor;
    }

    public void setEndFornecedor(Fornecedor endFornecedor) {
        this.endFornecedor = endFornecedor;
    }

    public String getEndRua() {
        return endRua;
    }

    public void setEndRua(String endRua) {
        this.endRua = endRua;
    }

    public String getEndNumero() {
        return endNumero;
    }

    public void setEndNumero(String endNumero) {
        this.endNumero = endNumero;
    }

    public String getEndCidade() {
        return endCidade;
    }

    public void setEndCidade(String endCidade) {
        this.endCidade = endCidade;
    }

    public String getEndCep() {
        return endCep;
    }

    public void setEndCep(String endCep) {
        this.endCep = endCep;
    }

    public String getEndEstado() {
        return endEstado;
    }

    public void setEndEstado(String endEstado) {
        this.endEstado = endEstado;
    }
}

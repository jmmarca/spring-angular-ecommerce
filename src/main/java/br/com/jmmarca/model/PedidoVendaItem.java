package br.com.jmmarca.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.jmmarca.model.generic.Entidade;

@Entity
@Table(name = "PEDIDO_VENDA_ITEM")
public class PedidoVendaItem extends Entidade {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", unique = true, nullable = false)
    private int id;

    @Column(name = "QUANTIDADE")
    private int quantidade;

    @Column(name = "VALOR", precision = 12, scale = 2)
    private BigDecimal valor;

    @Column(name = "VALOR_UNT", precision = 12, scale = 2)
    private BigDecimal valorUnt;

    @ManyToOne
    @JoinColumn(name = "ID_PEDIDO_VENDA")
    private PedidoVenda pedidoVenda;

    @ManyToOne
    @JoinColumn(name = "ID_PRODUTO")
    private Produto produto;

    public PedidoVendaItem() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public PedidoVenda getPedidoVenda() {
        return this.pedidoVenda;
    }

    public void setPedidoVenda(PedidoVenda pedidoVenda) {
        this.pedidoVenda = pedidoVenda;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public BigDecimal getValorUnt() {
        return valorUnt;
    }

    public void setValorUnt(BigDecimal valorUnt) {
        this.valorUnt = valorUnt;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PedidoVendaItem other = (PedidoVendaItem) obj;
        if (this.produto != other.produto && (this.produto == null || !this.produto.equals(other.produto))) {
            return false;
        }
        return true;
    }

}

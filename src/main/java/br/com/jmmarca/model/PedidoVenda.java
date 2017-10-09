package br.com.jmmarca.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.jmmarca.model.generic.Entidade;


@Entity
@Table(name="PEDIDO_VENDA")
public class PedidoVenda extends Entidade {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="ID",unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_FINALIZACAO")
	private Date dataFinalizacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_INCLUSAO")
	private Date dataInclusao;

	@Column(name="VALOR_TOTAL", precision=12, scale=2)
	private BigDecimal valorTotal;

	@ManyToOne
	@JoinColumn(name="ID_USUARIO")
	private Usuario usuario;

	@OneToMany(mappedBy="pedidoVenda")
	private List<PedidoVendaItem> pedidoVendaItems;

	public PedidoVenda() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataFinalizacao() {
		return this.dataFinalizacao;
	}

	public void setDataFinalizacao(Date dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

	public Date getDataInclusao() {
		return this.dataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public BigDecimal getValorTotal() {
		return this.valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


	public List<PedidoVendaItem> getPedidoVendaItems() {
		return this.pedidoVendaItems;
	}

	public void setPedidoVendaItems(List<PedidoVendaItem> pedidoVendaItems) {
		this.pedidoVendaItems = pedidoVendaItems;
	}

	public PedidoVendaItem addPedidoVendaItem(PedidoVendaItem pedidoVendaItem) {
		getPedidoVendaItems().add(pedidoVendaItem);
		pedidoVendaItem.setPedidoVenda(this);

		return pedidoVendaItem;
	}

	public PedidoVendaItem removePedidoVendaItem(PedidoVendaItem pedidoVendaItem) {
		getPedidoVendaItems().remove(pedidoVendaItem);
		pedidoVendaItem.setPedidoVenda(null);

		return pedidoVendaItem;
	}

}
package br.com.jmmarca.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.jmmarca.model.generic.Entidade;

@Entity
@Table(name="CONFIGURACAO")
public class Configuracao extends Entidade {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="ID",unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_ALTERACAO")
	private Date dataAlteracao;

	@Column(name="DESCRICAO_LOJA", length=255)
	private String descricaoLoja;

	@Column(precision=12, scale=2)
	private BigDecimal despesas;

	@Column(name="MARGEM_LUCRO_PERCENTUAL", precision=12, scale=2)
	private BigDecimal margemLucroPercentual;

	@ManyToOne
	@JoinColumn(name="ID_USUARIO")
	private Usuario usuario;

	public Configuracao() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataAlteracao() {
		return this.dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	public String getDescricaoLoja() {
		return this.descricaoLoja;
	}

	public void setDescricaoLoja(String descricaoLoja) {
		this.descricaoLoja = descricaoLoja;
	}

	public BigDecimal getDespesas() {
		return this.despesas;
	}

	public void setDespesas(BigDecimal despesas) {
		this.despesas = despesas;
	}

	public BigDecimal getMargemLucroPercentual() {
		return this.margemLucroPercentual;
	}

	public void setMargemLucroPercentual(BigDecimal margemLucroPercentual) {
		this.margemLucroPercentual = margemLucroPercentual;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
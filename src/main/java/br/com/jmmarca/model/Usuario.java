package br.com.jmmarca.model;

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

import br.com.jmmarca.model.enuns.EnumTipoUsuario;
import br.com.jmmarca.model.generic.Entidade;


@Entity
@Table(name = "USUARIO")
public class Usuario extends Entidade {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", unique = true, nullable = false)
    private int id;

    @Column(name = "LOGIN", length = 50)
    private String login;

    @Column(name = "NOME", length = 255)
    private String nome;

    @Column(name = "SENHA", length = 20)
    private String senha;

    @Column(length = 1)
    private EnumTipoUsuario tipo;

    @ManyToOne
    @JoinColumn(name = "ID_PESSOA")
    private Pessoa pessoa;

    @OneToMany(mappedBy = "usuario")
    private List<Configuracao> configuracaos;

    @OneToMany(mappedBy = "usuario")
    private List<PedidoVenda> pedidoVendas;

    public Usuario() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public EnumTipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(EnumTipoUsuario tipo) {
        this.tipo = tipo;
    }

    public List<Configuracao> getConfiguracaos() {
        return this.configuracaos;
    }

    public void setConfiguracaos(List<Configuracao> configuracaos) {
        this.configuracaos = configuracaos;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<PedidoVenda> getPedidoVendas() {
        return pedidoVendas;
    }

    public void setPedidoVendas(List<PedidoVenda> pedidoVendas) {
        this.pedidoVendas = pedidoVendas;
    }

}

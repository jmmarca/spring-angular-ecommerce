package br.com.jmmarca.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.jmmarca.model.generic.Entidade;

@Entity
@Table(name = "PESSOA")
public class Pessoa extends Entidade {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", unique = true, nullable = false)
    private int id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_CADASTRO")
    private Date dataCadastro;

    @Column(name = "ENDERECO_BAIRRO", length = 100)
    private String enderecoBairro;

    @Column(name = "ENDERECO_CEP", length = 20)
    private String enderecoCep;

    @Column(name = "ENDERECO_CIDADE", length = 200)
    private String enderecoCidade;

    @Column(name = "ENDERECO_LOGRADOURO", length = 255)
    private String enderecoLogradouro;

    @Column(name = "ENDERECO_NUMERO", length = 20)
    private String enderecoNumero;

    @Column(name = "ENDERECO_UF", length = 2)
    private String enderecoUf;

    @Column(name = "NOME", length = 255)
    private String nome;

    public Pessoa() {
    }

    public Date getDataCadastro() {
        return this.dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getEnderecoBairro() {
        return this.enderecoBairro;
    }

    public void setEnderecoBairro(String enderecoBairro) {
        this.enderecoBairro = enderecoBairro;
    }

    public String getEnderecoCep() {
        return this.enderecoCep;
    }

    public void setEnderecoCep(String enderecoCep) {
        this.enderecoCep = enderecoCep;
    }

    public String getEnderecoCidade() {
        return this.enderecoCidade;
    }

    public void setEnderecoCidade(String enderecoCidade) {
        this.enderecoCidade = enderecoCidade;
    }

    public String getEnderecoLogradouro() {
        return this.enderecoLogradouro;
    }

    public void setEnderecoLogradouro(String enderecoLogradouro) {
        this.enderecoLogradouro = enderecoLogradouro;
    }

    public String getEnderecoNumero() {
        return this.enderecoNumero;
    }

    public void setEnderecoNumero(String enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
    }

    public String getEnderecoUf() {
        return this.enderecoUf;
    }

    public void setEnderecoUf(String enderecoUf) {
        this.enderecoUf = enderecoUf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

package br.com.jmmarca.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import br.com.jmmarca.model.generic.Entidade;

@Entity
@Table(name = "PRODUTO")
public class Produto extends Entidade {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", unique = true, nullable = false)
    private int id;
    
    @Column(name="CODIGO",length = 50)
    private String codigo;   
    
    @Column(name="DESCRICAO",length = 200)
    private String descricao;

    @Column(name="FOTO",length = 255)
    private String foto;

    @Column(name="NOME",length = 50)
    private String nome;
    //bi-directional many-to-one association to CustoCompra
    @OneToMany(mappedBy = "produto")
    @OrderBy("id DESC")
    private List<CustoCompra> custoCompras;

    //bi-directional many-to-one association to PedidoVendaItem
    @OneToMany(mappedBy = "produto")
    private List<PedidoVendaItem> pedidoVendaItems;

    public Produto() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return this.foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<CustoCompra> getCustoCompras() {
        return this.custoCompras;
    }

    public void setCustoCompras(List<CustoCompra> custoCompras) {
        this.custoCompras = custoCompras;
    }

    public List<PedidoVendaItem> getPedidoVendaItems() {
        return this.pedidoVendaItems;
    }

    public void setPedidoVendaItems(List<PedidoVendaItem> pedidoVendaItems) {
        this.pedidoVendaItems = pedidoVendaItems;
    }

    public CustoCompra getCustoCompra(){
        List<CustoCompra> custoCompras = getCustoCompras();
        if(custoCompras!=null){
            return custoCompras.get(0);
        }
        return null;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Produto other = (Produto) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.codigo == null) ? (other.codigo != null) : !this.codigo.equals(other.codigo)) {
            return false;
        }
        return true;
    }
    
    
    
    

}


package br.com.jmmarca.model.enuns;

/**
 *
 * @author Jean Michel Marca
 */
public enum EnumTipoUsuario implements IEnum {

    ADMINISTRADOR("A", "Administrador"),
    CLIENTE("C", "Cliente");

    private final String key;
    private final String descricao;

    private EnumTipoUsuario(String key, String descricao) {
        this.key = key;
        this.descricao = descricao;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

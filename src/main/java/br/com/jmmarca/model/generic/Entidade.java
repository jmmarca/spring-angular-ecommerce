package br.com.jmmarca.model.generic;



import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Jean Michel Marca
 */
public abstract class Entidade implements Serializable {
    private int id;
}

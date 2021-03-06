package br.com.jmmarca.ws.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jmmarca.model.Cliente;
import br.com.jmmarca.model.Configuracao;

@Repository
public interface ConfiguracaoRepository extends JpaRepository<Configuracao,Integer> {

}

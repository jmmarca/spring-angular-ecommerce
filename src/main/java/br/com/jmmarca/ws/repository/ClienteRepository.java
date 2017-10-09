package br.com.jmmarca.ws.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jmmarca.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

	 List<Cliente> findByNome(String nome);
}

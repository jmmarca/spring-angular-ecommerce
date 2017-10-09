package br.com.jmmarca.ws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jmmarca.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {


}

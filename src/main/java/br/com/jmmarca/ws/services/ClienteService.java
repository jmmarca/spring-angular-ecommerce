package br.com.jmmarca.ws.services;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jmmarca.model.Cliente;
import br.com.jmmarca.ws.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente cadastrarCliente(Cliente cliente) {
		cliente = clienteRepository.save(cliente);
		return cliente;
	}

	public Collection<Cliente> buscarTodosClientes() {
		return clienteRepository.findAll();
	}

	public Cliente buscarPorId(Integer idCliente) {
		return clienteRepository.findOne(idCliente);
	}

	public void alterarCliente(Cliente cliente) {
		cliente = clienteRepository.save(cliente);
	}

	public void remove(Integer id) {
		clienteRepository.delete(id);
	}
	
	public List<Cliente> findByName(String nome) {
		return clienteRepository.findByNome(nome);
	}

}

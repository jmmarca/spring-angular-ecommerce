package br.com.jmmarca.ws.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.jmmarca.model.Cliente;
import br.com.jmmarca.ws.services.ClienteService;

@RestController
public class ClienteController {

	@Autowired
	ClienteService clienteService;

	@RequestMapping(method = RequestMethod.POST, value = "/clientes", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Cliente> cadastrar(@RequestBody Cliente cliente) {
		Cliente cadastrarCliente = clienteService.cadastrarCliente(cliente);
		return new ResponseEntity<Cliente>(cadastrarCliente, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/clientes", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Cliente> alterar(@RequestBody Cliente cliente) {
		clienteService.alterarCliente(cliente);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/clientes", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Cliente>> buscar() {
		return new ResponseEntity<Collection<Cliente>>(clienteService.buscarTodosClientes(), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/clientes/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Cliente> remove(@PathVariable Integer id) {
		Cliente clienteencontrado = clienteService.buscarPorId(id);
		if (clienteencontrado == null) {
			new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		clienteService.remove(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/clientes/{nome}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Cliente>> buscar(@PathVariable String nome) {
		return new ResponseEntity<Collection<Cliente>>(clienteService.findByName(nome), HttpStatus.OK);
	}

}

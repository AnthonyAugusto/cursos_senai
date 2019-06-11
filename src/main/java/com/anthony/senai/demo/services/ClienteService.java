package com.anthony.senai.demo.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.anthony.senai.demo.domain.Cliente;
import com.anthony.senai.demo.repositories.ClienteRepository;
import com.anthony.senai.demo.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	private ClienteRepository repo;
	
	public Cliente buscar(Integer idCliente) {
		Optional<Cliente> obj = repo.findById(idCliente);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Número de Id não encontrado. Id:" + idCliente + ", tipo: " + Cliente.class.getName()));
	}

}

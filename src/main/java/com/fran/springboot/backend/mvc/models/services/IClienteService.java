package com.fran.springboot.backend.mvc.models.services;

import java.util.List;

import com.fran.springboot.backend.mvc.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();  // Get todos los clientes
	
	public Cliente save(Cliente cliente);  // Insert de un cliente
	
	public Cliente findById(Long id);   //  Devuelve los datos de un solo cliente
	
	public void delete(Long id);  // Elimina un cliente
	
}

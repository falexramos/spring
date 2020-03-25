package com.favian.springboot.app.models.dao;

import java.util.List;

import com.favian.springboot.app.models.entity.Cliente;

public interface IClienteDao {

	public List<Cliente> findAll();
	
	public void save (Cliente cliente);
}

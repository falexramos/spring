package com.favian.springboot.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.favian.springboot.app.models.dao.IClienteDao;

@Controller
public class ClienteController {
	
	@Autowired
	private IClienteDao clienteDao;
	
	@RequestMapping(value="/listar",method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de Cleintes");
		model.addAttribute("clientes", clienteDao.findAll());
		return "listar";
	}
	
}

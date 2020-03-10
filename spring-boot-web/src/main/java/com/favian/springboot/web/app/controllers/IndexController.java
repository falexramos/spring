package com.favian.springboot.web.app.controllers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.favian.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({"/index","/","","/home"})
	public String Index(Model model) {
		model.addAttribute("titulo","hola spring framework");
		return "index";
	}
	
@RequestMapping("/perfil")
public String perfil(Model model) {
	Usuario usuario = new Usuario();
	usuario.setNombre("Andrés");
	usuario.setApellido("Ramos");
	usuario.setEmail("correo@gmail.com");
	model.addAttribute("usuario", usuario);
	model.addAttribute("titulo","Perfil de usuario: ".concat(usuario.getNombre()));
	return "perfil";
	}


@RequestMapping("/listar")
public String listar(Model model) {
		 
		model.addAttribute("titulo", "Listado de Uusarios");
		
	return "listar";
	}

@ModelAttribute("usuarios")
public List<Usuario> poblarUsuarios(){
	List<Usuario> usuarios = Arrays.asList(
			new Usuario("Andrés","Ramos","correo@gmail.com"),
			new Usuario("Jhon","Doe","jhon@gmail.com"),
			new Usuario("Jane","Doe","Jane@gmail.com"),
			new Usuario("tornado","Roe","roe@gmail.com")
			);
	return usuarios;
	}

}

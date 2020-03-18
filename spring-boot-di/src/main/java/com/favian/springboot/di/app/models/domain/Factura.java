package com.favian.springboot.di.app.models.domain;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Factura {
	
	
	@Value("${factura.descripcion}")
	public String descripcion;
	
	@Autowired
	private Cliente cliente;
	
	@Autowired
	private List<ItemFactura> items;
	
	@PostConstruct
	public void inicializar() {
		cliente.setNombre(cliente.getNombre().concat(" ").concat("jose"));
		descripcion = descripcion.concat(" del cliente: ").concat(cliente.getNombre());
	}
	
	@PreDestroy
	public void destruir() {
		System.out.println("Factura destruida".concat(descripcion));
	}

	private String getDescripcion() {
		return descripcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemFactura> getItems() {
		return items;
	}

	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

}

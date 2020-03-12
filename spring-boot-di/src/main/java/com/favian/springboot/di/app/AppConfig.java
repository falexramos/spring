package com.favian.springboot.di.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.favian.springboot.di.app.models.domain.ItemFactura;
import com.favian.springboot.di.app.models.domain.Producto;
import com.favian.springboot.di.app.models.service.IServicio;
import com.favian.springboot.di.app.models.service.MiServicio;
import com.favian.springboot.di.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {

	@Bean("miServicioSimple")
	@Primary
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	public IServicio registrarMiservicioComplejo() {
		return new MiServicioComplejo();
	}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1=new Producto("Camara sony", 100);
		Producto producto2=new Producto("Bicicleta bianchi aro 26", 200);
		
		ItemFactura linea1=new ItemFactura(producto1, 2);
		ItemFactura linea2=new ItemFactura(producto2, 4);
		
		return Arrays.asList(linea1,linea2);
	}
}

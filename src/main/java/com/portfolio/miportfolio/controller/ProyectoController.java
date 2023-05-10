package com.portfolio.miportfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.miportfolio.model.Proyecto;
import com.portfolio.miportfolio.service.IProyectoService;

@RestController
@RequestMapping("/proyecto")
public class ProyectoController {
	
	@Autowired
	IProyectoService proyectoService;
	
	@GetMapping("/proyectos")
	public List<Proyecto> getProyectos() {
		 return proyectoService.getProyectos();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Long id) {
		proyectoService.eliminar(id);
	}
	 
	@PutMapping("/editar")
	public Proyecto editar(@RequestBody Proyecto proyecto) {
		return proyectoService.editar(proyecto);
	}

}

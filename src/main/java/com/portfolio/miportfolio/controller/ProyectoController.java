package com.portfolio.miportfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.miportfolio.model.Proyecto;
import com.portfolio.miportfolio.service.IProyectoService;

@RestController
@RequestMapping("/proyecto")
public class ProyectoController {
	
	@Autowired
	IProyectoService proyectoService;
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
	@GetMapping("/proyectos")
	public List<Proyecto> getProyectos() {
		 return proyectoService.getProyectos();
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.DELETE})
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Long id) {
		proyectoService.eliminar(id);
	}
	 
	@CrossOrigin(origins = "*", methods= {RequestMethod.PUT})
	@PutMapping("/editar")
	public Proyecto editar(@RequestBody Proyecto proyecto) {
		return proyectoService.editar(proyecto);
	}

}

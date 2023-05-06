package com.portfolio.miportfolio.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.miportfolio.model.Experiencia;
import com.portfolio.miportfolio.service.IExperienciaService;


@RestController
@RequestMapping("/experiencia")
public class ExperienciaController {
	
	@Autowired
	IExperienciaService experienciaService;
		
	@GetMapping("/experiencias")
	public ArrayList<Experiencia> getExperiencia() {
		return experienciaService.getExperiencia();
	}
		 
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable String id) {
		experienciaService.eliminar();
	}
		 
	@PutMapping("/editar")
	public Experiencia editar(@RequestBody Experiencia experiencia) {
		return experienciaService.editar();
	}

}



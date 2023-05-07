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

import com.portfolio.miportfolio.model.Educacion;
import com.portfolio.miportfolio.service.IEducacionService;

@RestController
@RequestMapping("/educacion")
public class EducacionController {
	
	@Autowired
	IEducacionService educacionService;
	
	@GetMapping("/estudios")
	public ArrayList<Educacion>getEstudios() {
		return educacionService.getEstudios();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar (@PathVariable String id) {
		educacionService.eliminar();
	}
	
	@PutMapping("/editar")
	 public Educacion editar(@RequestBody Educacion educacion) {
		 return educacionService.editar(educacion);
	 }
	
}

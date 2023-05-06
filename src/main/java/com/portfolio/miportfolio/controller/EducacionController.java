package com.portfolio.miportfolio.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.miportfolio.model.Educacion;

@RestController
@RequestMapping("/educacion")
public class EducacionController {
	
	@GetMapping("/estudios")
	public ArrayList<Educacion>getEstudios() {
		ArrayList<Educacion> estudios = new ArrayList<Educacion>();
		return estudios;
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar (@PathVariable String id) {
		
		
	}
	
	@PutMapping("/editar")
	 public Educacion editar(@RequestBody Educacion educacion) {
		 return educacion;
	 }
	
}

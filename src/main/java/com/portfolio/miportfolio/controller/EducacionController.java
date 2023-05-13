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

import com.portfolio.miportfolio.model.Educacion;
import com.portfolio.miportfolio.service.IEducacionService;

@RestController
@RequestMapping("/educacion")
public class EducacionController {
	
	@Autowired
	IEducacionService educacionService;
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
	@GetMapping("/estudios")
	public List<Educacion>getEstudios() {
		return educacionService.getEstudios();
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.DELETE})
	@DeleteMapping("/eliminar/{id}")
	public void eliminar (@PathVariable Long id) {
		educacionService.eliminar(id);
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.PUT})
	@PutMapping("/editar")
	 public Educacion editar(@RequestBody Educacion educacion) {
		 return educacionService.editar(educacion);
	 }
	
}

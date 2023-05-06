package com.portfolio.miportfolio.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.miportfolio.model.Experiencia;


@RestController
@RequestMapping("/experiencia")
public class ExperienciaController {
		
		 @GetMapping("/experiencias")
		 public ArrayList<Experiencia> getExperiencia() {
			 ArrayList<Experiencia> experiencia = new ArrayList<Experiencia>();
			 return experiencia;
		 }
		 
		 @DeleteMapping("/eliminar/{id}")
		 public String eliminar(@PathVariable String id) {
			 return "Eliminar experiencia" + id;
		 }
		 
		 @PutMapping("/editar")
		 public Experiencia editar(@RequestBody Experiencia experiencia) {
			 return experiencia;
		 }

}



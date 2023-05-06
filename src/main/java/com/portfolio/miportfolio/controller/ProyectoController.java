package com.portfolio.miportfolio.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.miportfolio.model.Proyecto;

@RestController
@RequestMapping("/proyecto")
public class ProyectoController {
	
	 @GetMapping("/proyectos")
	 public ArrayList<Proyecto> getProyectos() {
		 return null;
	 }
	 
	 @DeleteMapping("/eliminar/{id}")
	 public String eliminar(@PathVariable String id) {
		 return "Eliminar proyectos" + id;
	 }
	 
	 @PutMapping("/editar")
	 public Proyecto editar(@RequestBody Proyecto proyecto) {
		 return proyecto;
	 }

}

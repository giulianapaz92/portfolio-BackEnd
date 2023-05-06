package com.portfolio.miportfolio.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.miportfolio.model.Tecnologia;

@RestController
@RequestMapping("/tecnologia")
public class TecnologiaController {

	 @GetMapping("/tecnologias")
	 public ArrayList<Tecnologia> getTecnologias() {
		 return null;
	 }
	 
	 @DeleteMapping("/eliminar/{id}")
	 public String eliminar(@PathVariable String id) {
		 return "Eliminar tecnologias" + id;
	 }
	 
	 @PutMapping("/editar")
	 public Tecnologia editar(@RequestBody Tecnologia tecnologia) {
		 return tecnologia;
	 }

}

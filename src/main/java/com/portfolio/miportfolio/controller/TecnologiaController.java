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

import com.portfolio.miportfolio.model.Tecnologia;
import com.portfolio.miportfolio.service.ITecnologiaService;

@RestController
@RequestMapping("/tecnologia")
public class TecnologiaController {
	
	@Autowired
	ITecnologiaService tecnologiaService;

	 @GetMapping("/tecnologias")
	 public ArrayList<Tecnologia> getTecnologias() {
		 return tecnologiaService.getTecnologia();
	 }
	 
	 @DeleteMapping("/eliminar/{id}")
	 public void eliminar(@PathVariable String id) {
		 tecnologiaService.eliminar();
	 }
	 
	 @PutMapping("/editar")
	 public Tecnologia editar(@RequestBody Tecnologia tecnologia) {
		 return tecnologiaService.editar();
	 }

}

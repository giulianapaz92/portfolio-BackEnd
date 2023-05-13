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

import com.portfolio.miportfolio.model.Tecnologia;
import com.portfolio.miportfolio.service.ITecnologiaService;

@RestController
@RequestMapping("/tecnologia")
public class TecnologiaController {
	
	@Autowired
	ITecnologiaService tecnologiaService;

	 @CrossOrigin(origins = "*", methods= {RequestMethod.GET})
	 @GetMapping("/tecnologias")
	 public List<Tecnologia> getTecnologias() {
		 return tecnologiaService.getTecnologia();
	 }
	 
	 @CrossOrigin(origins = "*", methods= {RequestMethod.DELETE})
	 @DeleteMapping("/eliminar/{id}")
	 public void eliminar(@PathVariable Long id) {
		 tecnologiaService.eliminar(id);
	 }
	 
	 @CrossOrigin(origins = "*", methods= {RequestMethod.PUT})
	 @PutMapping("/editar")
	 public Tecnologia editar(@RequestBody Tecnologia tecnologia) {
		 return tecnologiaService.editar(tecnologia);
	 }

}

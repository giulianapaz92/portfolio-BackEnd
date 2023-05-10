package com.portfolio.miportfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.miportfolio.model.Usuario;
import com.portfolio.miportfolio.service.IUsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	IUsuarioService usuarioService;
	
    @GetMapping("/login/{mail}/{password}")
    public Usuario login(@PathVariable("mail") String mail,@PathVariable("password") String password) {
    	return usuarioService.login(mail, password);
		}
}
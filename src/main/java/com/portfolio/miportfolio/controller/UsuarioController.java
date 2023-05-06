package com.portfolio.miportfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.miportfolio.model.Usuario;
import com.portfolio.miportfolio.service.IUsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	IUsuarioService usuarioService;
	
    @GetMapping("/login")
    public Usuario login(@RequestParam("user") String user,@RequestParam("pass") String pass) {
    	return usuarioService.login();
		}
}
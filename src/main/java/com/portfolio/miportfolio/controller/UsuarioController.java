package com.portfolio.miportfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.miportfolio.model.Usuario;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
    @GetMapping("/login")
    public Usuario login(@RequestParam("user") String user,@RequestParam("pass") String pass) {
    	return null;
		}
}
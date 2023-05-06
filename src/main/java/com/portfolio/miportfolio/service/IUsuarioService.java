package com.portfolio.miportfolio.service;

import org.springframework.stereotype.Service;

import com.portfolio.miportfolio.model.Usuario;

@Service
public interface IUsuarioService {
	
	public Usuario login();

}

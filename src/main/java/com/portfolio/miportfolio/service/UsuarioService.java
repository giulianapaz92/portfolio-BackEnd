package com.portfolio.miportfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.miportfolio.model.Usuario;
import com.portfolio.miportfolio.repository.UsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService{
	
	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public Usuario login() {
		// TODO Auto-generated method stub
		return null;
	}

}

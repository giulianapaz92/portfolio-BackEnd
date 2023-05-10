package com.portfolio.miportfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.miportfolio.model.Usuario;
import com.portfolio.miportfolio.repository.IUsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService{
	
	@Autowired
	private IUsuarioRepository usuarioRepository;

	@Override
	public Usuario login(String mail, String password) {
		return usuarioRepository.findByMailAndPassword(mail, password);
	}

}

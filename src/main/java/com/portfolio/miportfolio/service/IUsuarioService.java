package com.portfolio.miportfolio.service;


import com.portfolio.miportfolio.model.Usuario;

public interface IUsuarioService {
	
	public Usuario login(String mail, String password);

}

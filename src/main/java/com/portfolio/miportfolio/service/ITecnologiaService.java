package com.portfolio.miportfolio.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.portfolio.miportfolio.model.Tecnologia;

@Service
public interface ITecnologiaService {
	
	public ArrayList<Tecnologia> getTecnologia();
	
	public void eliminar();
	
	public Tecnologia editar();

}

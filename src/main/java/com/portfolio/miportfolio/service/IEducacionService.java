package com.portfolio.miportfolio.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.portfolio.miportfolio.model.Educacion;

@Service
public interface IEducacionService {
	
	public ArrayList<Educacion> getEstudios();
	
	public void eliminar();
	
	public Educacion editar();
	

}
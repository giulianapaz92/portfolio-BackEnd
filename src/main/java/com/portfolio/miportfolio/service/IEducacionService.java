package com.portfolio.miportfolio.service;

import java.util.ArrayList;


import com.portfolio.miportfolio.model.Educacion;

public interface IEducacionService {
	
	public ArrayList<Educacion> getEstudios();
	
	public void eliminar();
	
	public Educacion editar(Educacion educacion);
	

}
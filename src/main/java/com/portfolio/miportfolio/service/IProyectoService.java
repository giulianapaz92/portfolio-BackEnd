package com.portfolio.miportfolio.service;

import java.util.ArrayList;


import com.portfolio.miportfolio.model.Proyecto;

public interface IProyectoService {
	
	public ArrayList<Proyecto> getProyectos();
	
	public void eliminar();
	
	public Proyecto editar();

}
package com.portfolio.miportfolio.service;

import java.util.List;

import com.portfolio.miportfolio.model.Proyecto;

public interface IProyectoService {
	
	public List<Proyecto> getProyectos();
	
	public void eliminar(Long id);
	
	public Proyecto editar(Proyecto proyecto);

}
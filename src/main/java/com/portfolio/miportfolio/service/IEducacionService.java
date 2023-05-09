package com.portfolio.miportfolio.service;

import java.util.List;

import com.portfolio.miportfolio.model.Educacion;

public interface IEducacionService {
	
	public List<Educacion> getEstudios();
	
	public void eliminar(Long id);
	
	public Educacion editar(Educacion educacion);

}
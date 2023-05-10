package com.portfolio.miportfolio.service;

import java.util.List;

import com.portfolio.miportfolio.model.Experiencia;

public interface IExperienciaService {

	public List<Experiencia> getExperiencia();
	
	public void eliminar(Long id);
	
	public Experiencia editar(Experiencia experiencia);
	
}

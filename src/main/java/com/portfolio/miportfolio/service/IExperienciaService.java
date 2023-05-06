package com.portfolio.miportfolio.service;

import java.util.ArrayList;


import com.portfolio.miportfolio.model.Experiencia;

public interface IExperienciaService {

	public ArrayList<Experiencia> getExperiencia();
	
	public void eliminar();
	
	public Experiencia editar();
	
}

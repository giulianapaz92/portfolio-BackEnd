package com.portfolio.miportfolio.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.portfolio.miportfolio.model.Experiencia;

@Service
public interface IExperienciaService {

	public ArrayList<Experiencia> getExperiencia();
	
	public void eliminar();
	
	public Experiencia editar();
	
}

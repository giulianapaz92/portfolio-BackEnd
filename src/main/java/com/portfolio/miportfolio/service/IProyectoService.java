package com.portfolio.miportfolio.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.portfolio.miportfolio.model.Proyecto;

@Service
public interface IProyectoService {
	
	public ArrayList<Proyecto> getProyectos();
	
	public void eliminar();
	
	public Proyecto editar();

}
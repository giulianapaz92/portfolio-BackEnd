package com.portfolio.miportfolio.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.miportfolio.model.Proyecto;
import com.portfolio.miportfolio.repository.ProyectoRepository;

@Service
public class ProyectoService implements IProyectoService{
	
	@Autowired
	ProyectoRepository proyectoRepository;

	@Override
	public ArrayList<Proyecto> getProyectos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Proyecto editar(Proyecto proyecto) {
		// TODO Auto-generated method stub
		return null;
	}

}

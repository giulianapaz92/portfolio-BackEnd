package com.portfolio.miportfolio.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.miportfolio.model.Proyecto;
import com.portfolio.miportfolio.repository.IProyectoRepository;

@Service
public class ProyectoService implements IProyectoService{
	
	@Autowired
	private IProyectoRepository proyectoRepository;

	@Override
	public List<Proyecto> getProyectos() {
		List<Proyecto> listaProyectos = proyectoRepository.findAll();
		return listaProyectos;
	} 

	@Override
	public void eliminar(Long id) {
		proyectoRepository.deleteById(id);		
	}

	@Override
	public Proyecto editar(Proyecto proyecto) {
		return proyectoRepository.save(proyecto);
	}

}

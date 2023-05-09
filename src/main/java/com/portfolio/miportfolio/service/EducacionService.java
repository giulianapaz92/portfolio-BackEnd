package com.portfolio.miportfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.miportfolio.model.Educacion;
import com.portfolio.miportfolio.repository.IEducacionRepository;

@Service
public class EducacionService implements IEducacionService{
	
	@Autowired
	private IEducacionRepository educacionRepository;

	@Override
	public List<Educacion> getEstudios() {
		List<Educacion> listaEducacion = educacionRepository.findAll();
		return listaEducacion;
	} 
	@Override
	public void eliminar(Long id) {
		educacionRepository.deleteById(id);
	}

	@Override
	public Educacion editar(Educacion educacion){
		return educacionRepository.save(educacion);	
	}

}

package com.portfolio.miportfolio.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.miportfolio.model.Experiencia;
import com.portfolio.miportfolio.repository.IExperienciaRepository;

@Service
public class ExperienciaService implements IExperienciaService{
	
	@Autowired
	private IExperienciaRepository experienciaRepository;

	@Override
	public List<Experiencia> getExperiencia() {
		List<Experiencia> listaExperiencia = experienciaRepository.findAll();
		return listaExperiencia;
	} 

	@Override
	public void eliminar(Long id) {
		experienciaRepository.deleteById(id);
	}


	@Override
	public Experiencia editar(Experiencia experiencia) {
		return experienciaRepository.save(experiencia);
	}
	
}

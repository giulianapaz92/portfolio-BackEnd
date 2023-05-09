package com.portfolio.miportfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.miportfolio.model.Tecnologia;
import com.portfolio.miportfolio.repository.ITecnologiaRepository;

@Service
public class TecnologiaService implements ITecnologiaService{
	
	@Autowired
	private ITecnologiaRepository tecnologiaRepository;
	
	@Override
	public List<Tecnologia> getTecnologia() {
		List<Tecnologia> listaTecnologias = tecnologiaRepository.findAll();
		return listaTecnologias;
	}

	@Override
	public void eliminar(Long id) {
		tecnologiaRepository.deleteById(id);
	}

	@Override
	public Tecnologia editar(Tecnologia tecnologia) {
		return tecnologiaRepository.save(tecnologia);
	}

}

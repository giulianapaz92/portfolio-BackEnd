package com.portfolio.miportfolio.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.miportfolio.model.Experiencia;
import com.portfolio.miportfolio.repository.ExperienciaRepository;

@Service
public class ExperienciaService implements IExperienciaService{
	
	@Autowired
	ExperienciaRepository experienciaRepository;

	@Override
	public ArrayList<Experiencia> getExperiencia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Experiencia editar(Experiencia experiencia) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

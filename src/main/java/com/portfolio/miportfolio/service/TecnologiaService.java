package com.portfolio.miportfolio.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.miportfolio.model.Tecnologia;
import com.portfolio.miportfolio.repository.TecnologiaRepository;

@Service
public class TecnologiaService implements ITecnologiaService{
	
	@Autowired
	TecnologiaRepository tecnologiaRepository;
	
	@Override
	public ArrayList<Tecnologia> getTecnologia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Tecnologia editar(Tecnologia tecnologia) {
		// TODO Auto-generated method stub
		return null;
	}

}

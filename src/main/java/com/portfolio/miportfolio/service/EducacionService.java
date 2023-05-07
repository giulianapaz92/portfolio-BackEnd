package com.portfolio.miportfolio.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.miportfolio.model.Educacion;
import com.portfolio.miportfolio.repository.EducacionRepository;

@Service
public class EducacionService implements IEducacionService{
	
	@Autowired
	EducacionRepository educacionRepository;

	@Override
	public ArrayList<Educacion> getEstudios() {

		return null;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Educacion editar(Educacion educacion) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

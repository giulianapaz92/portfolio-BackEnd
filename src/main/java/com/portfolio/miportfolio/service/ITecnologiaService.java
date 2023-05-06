package com.portfolio.miportfolio.service;

import java.util.ArrayList;


import com.portfolio.miportfolio.model.Tecnologia;

public interface ITecnologiaService {
	
	public ArrayList<Tecnologia> getTecnologia();
	
	public void eliminar();
	
	public Tecnologia editar();

}

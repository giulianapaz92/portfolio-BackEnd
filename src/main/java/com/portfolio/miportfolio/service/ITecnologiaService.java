package com.portfolio.miportfolio.service;

import java.util.List;

import com.portfolio.miportfolio.model.Tecnologia;

public interface ITecnologiaService {
	
	public List<Tecnologia> getTecnologia();
	
	public void eliminar(Long id);
	
	public Tecnologia editar(Tecnologia tecnologia);

}

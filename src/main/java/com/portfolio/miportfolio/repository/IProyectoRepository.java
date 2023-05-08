package com.portfolio.miportfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.portfolio.miportfolio.model.Proyecto;

@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto, Long>{

}
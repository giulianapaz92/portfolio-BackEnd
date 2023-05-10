package com.portfolio.miportfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.portfolio.miportfolio.model.Experiencia;

@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia, Long> {

}

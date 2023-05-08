package com.portfolio.miportfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.portfolio.miportfolio.model.Tecnologia;

@Repository
public interface ITecnologiaRepository extends JpaRepository<Tecnologia, Long>{

}

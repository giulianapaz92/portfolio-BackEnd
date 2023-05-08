package com.portfolio.miportfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.portfolio.miportfolio.model.Educacion;

@Repository
public interface IEducacionRepository extends JpaRepository<Educacion, Long> {

}

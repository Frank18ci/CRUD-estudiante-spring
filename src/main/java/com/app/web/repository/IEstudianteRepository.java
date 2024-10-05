package com.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.models.Estudiante;
@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante, Long>  {

}

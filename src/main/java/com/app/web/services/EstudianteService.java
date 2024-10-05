package com.app.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.models.Estudiante;
import com.app.web.repository.IEstudianteRepository;
@Service
public class EstudianteService implements IEstudianteService {
	
	@Autowired
	private IEstudianteRepository repository;
	
	public List<Estudiante> listarTodosLosEstudiantes() {
		return repository.findAll();
	}
	public Estudiante guardarEstudiante(Estudiante estudiante) {
		return repository.save(estudiante);
	}
}

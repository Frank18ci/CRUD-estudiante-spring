package com.app.web.services;

import java.util.List;


import com.app.web.models.Estudiante;

public interface IEstudianteService{
	public List<Estudiante> listarTodosLosEstudiantes();
	public Estudiante guardarEstudiante(Estudiante estudiante);
	public Estudiante obtenerEstudiante(Long id);
	public Estudiante actualizarEstudiante(Estudiante estudiante);
	public void eliminarEstudiante(Long id);
}

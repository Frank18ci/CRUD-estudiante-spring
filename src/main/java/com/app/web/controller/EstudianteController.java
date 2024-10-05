package com.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.models.Estudiante;
import com.app.web.services.EstudianteService;

@Controller
public class EstudianteController {
	@Autowired
	private EstudianteService service;
	
	@GetMapping({"/estudiantes", "/"})
	public String listarEstudiantes(Model model) {
		model.addAttribute("estudiantes", service.listarTodosLosEstudiantes());
		return "estudiantes";
	}
	@GetMapping("/estudiantes/nuevo")
	public String mostrarFormularioRegistrarCliente(Model model) {
		Estudiante estudiante = new Estudiante();
		model.addAttribute("estudiante", estudiante);
		return "crear_estudiante";
	}
	@PostMapping("/estudiantes")
	public String guardarEstudiante(@ModelAttribute Estudiante estudiante) {
		service.guardarEstudiante(estudiante);
		return "redirect:/estudiantes";
	}
}

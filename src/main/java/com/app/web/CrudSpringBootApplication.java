package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.models.Estudiante;
import com.app.web.repository.IEstudianteRepository;

@SpringBootApplication
public class CrudSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootApplication.class, args);
	}
	
//	@Autowired
//	private IEstudianteRepository repository;

	public void run(String... args) throws Exception {
//		Estudiante estudiante1 = new Estudiante("Cristian", "Ramirez", "Cris@gmail.com");
//		repository.save(estudiante1);
//		Estudiante estudiante2 = new Estudiante("Juan", "Garcia", "juga@gmail.com");
//		repository.save(estudiante2);
//		Estudiante estudiante3 = new Estudiante("Pedro", "Perez", "pepe@gmail.com");
//		repository.save(estudiante3);
		
	}
}

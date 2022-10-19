package com.edutecno.controlalumnos.alumnos.service;

import java.util.List;

import com.edutecno.controlalumnos.alumnos.modelo.Alumno;

public interface AlumnoService {
	
	List<Alumno> findAll();
	
	void save(Alumno alumno);

}

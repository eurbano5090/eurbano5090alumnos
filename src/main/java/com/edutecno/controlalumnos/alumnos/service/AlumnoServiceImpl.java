package com.edutecno.controlalumnos.alumnos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.controlalumnos.alumnos.modelo.Alumno;
import com.edutecno.controlalumnos.alumnos.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Override
	public List<Alumno> findAll() {
		return alumnoRepository.findAll();
	}

	@Override
	public void save(Alumno alumno) {
		alumnoRepository.save(alumno);
	}

}

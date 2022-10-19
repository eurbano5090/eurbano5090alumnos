package com.edutecno.controlalumnos.alumnos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.controlalumnos.alumnos.modelo.Direccion;
import com.edutecno.controlalumnos.alumnos.repository.DireccionRepository;

@Service
public class DireccionServiceImpl implements DireccionService {

	@Autowired
	private DireccionRepository direccionRepository;
	
	@Override
	public List<Direccion> findAll() {
		//Controlador -> Servicio -> repositorio -----> BD
		//puede haber mas logica
		return direccionRepository.findAll();
	}

	@Override
	public void save(Direccion direccion) {
		direccionRepository.save(direccion);
	}

}

package com.edutecno.controlalumnos.alumnos.service;

import java.util.List;
import com.edutecno.controlalumnos.alumnos.modelo.Direccion;

public interface DireccionService {

	List<Direccion> findAll();

	void save(Direccion direccion);

}

package com.edutecno.controlalumnos.alumnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edutecno.controlalumnos.alumnos.modelo.Direccion;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion, Long> {

}

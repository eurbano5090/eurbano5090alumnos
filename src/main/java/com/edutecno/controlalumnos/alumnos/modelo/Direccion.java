package com.edutecno.controlalumnos.alumnos.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Direccion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String calle;
	private String numero;
	private String ciudad;
	private TipoDireccion tipo;
	
	public Direccion() {
		super();
	}
	
	public Direccion(Long id, String calle, String numero, String ciudad, TipoDireccion tipo) {
		super();
		this.id = id;
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
		this.tipo = tipo;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public TipoDireccion getTipo() {
		return tipo;
	}
	public void setTipo(TipoDireccion tipo) {
		this.tipo = tipo;
	}	
}

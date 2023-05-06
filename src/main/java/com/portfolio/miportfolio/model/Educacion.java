package com.portfolio.miportfolio.model;

import java.util.Date;

public class Educacion {
	
	private int id;
	private String nombre;
	private String estado;
	private Date fecha;
	private String titulo;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return "Educacion [id=" + id + ", nombre=" + nombre + ", estado=" + estado + ", fecha=" + fecha + ", titulo="
				+ titulo + "]";
	}
	
}

package com.portfolio.miportfolio.model;

public class Educacion {
	
	private String nombre;
	private String estado;
	private String fecha;
	private String titulo;
	
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
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public String toString() {
		return "Educacion [nombre=" + nombre + ", estado=" + estado + ", fecha=" + fecha + ", titulo=" + titulo + "]";
	}
	

}

package com.portfolio.miportfolio.model;

public class Tecnologia {
	
	private int id;
	private String nombre;
	private String nivel;
	
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
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	@Override
	public String toString() {
		return "Tecnologia [id=" + id + ", nombre=" + nombre + ", nivel=" + nivel + "]";
	}
	
	
}

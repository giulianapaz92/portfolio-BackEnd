package com.portfolio.miportfolio.model;

public class Experiencia {
	
	private int id;
	private String empresa;
	private String año;
	private String puesto;
	private String descripcion;
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getAño() {
		return año;
	}
	public void setAño(String año) {
		this.año = año;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Experiencia [id=" + id + ", empresa=" + empresa + ", año=" + año + ", puesto=" + puesto
				+ ", descripcion=" + descripcion + "]";
	}
	
}

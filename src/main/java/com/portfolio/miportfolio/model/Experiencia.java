package com.portfolio.miportfolio.model;

public class Experiencia {
	
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
	
	@Override
	public String toString() {
		return "ExperienciaLaboral [empresa=" + empresa + ", año=" + año + ", puesto=" + puesto + ", descripcion="
				+ descripcion + "]";
	}
	
}

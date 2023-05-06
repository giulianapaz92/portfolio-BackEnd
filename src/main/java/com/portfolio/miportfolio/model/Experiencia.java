package com.portfolio.miportfolio.model;

import java.util.Date;

public class Experiencia {
	
	private int id;
	private String empresa;
	private Date fecha;
	private String puesto;
	private String descripcion;
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
		return "Experiencia [id=" + id + ", empresa=" + empresa + ", año=" + fecha + ", puesto=" + puesto
				+ ", descripcion=" + descripcion + "]";
	}
	
}

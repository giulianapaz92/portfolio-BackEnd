package com.portfolio.miportfolio.model;


public class Experiencia {
	
	private int id;
	private String empresa;
	private String fechaDesde;
	private String fechaHasta;
	private String puesto;
	private String descripcion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getFechaDesde() {
		return fechaDesde;
	}
	public void setFechaDesde(String fechaDesde) {
		this.fechaDesde = fechaDesde;
	}
	public String getFechaHasta() {
		return fechaHasta;
	}
	public void setFechaHasta(String fechaHasta) {
		this.fechaHasta = fechaHasta;
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
		return "Experiencia [id=" + id + ", empresa=" + empresa + ", fechaDesde=" + fechaDesde + ", fechaHasta="
				+ fechaHasta + ", puesto=" + puesto + ", descripcion=" + descripcion + "]";
	}
	
	
}

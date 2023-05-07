package com.portfolio.miportfolio.model;


public class Educacion {
	
	private int id;
	private String nombre;
	private String estado;
	private String fechaDesde;
	private String fechaHasta;
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
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public String toString() {
		return "Educacion [id=" + id + ", nombre=" + nombre + ", estado=" + estado + ", fechaDesde=" + fechaDesde
				+ ", fechaHasta=" + fechaHasta + ", titulo=" + titulo + "]";
	}
	
	
	
}

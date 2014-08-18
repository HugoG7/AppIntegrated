package com.integrated.model.dto.beans;

public class Puesto {
	private String nombre;
	private boolean activo;
	
	public Puesto(){
		
	}
	
	public Puesto(String nombre, boolean activo){
		this.nombre = nombre;
		this.activo = activo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Puesto [nombre=" + nombre + ", activo=" + activo + "]";
	}
}

package com.integrated.model.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.integrated.model.dto.beans.PersonalDatos;
import com.integrated.model.dto.beans.Puesto;

@Document(collection = "usuarios")
public class Usuarios {
	@Id
	private String id;
	private String usuario;
	private String password;
	private PersonalDatos personal_datos;
	private String email;
	private Puesto puesto;
	private boolean activo;
	
	public Usuarios(){
		
	}
	
	public Usuarios(String usuario, String password, PersonalDatos personal_datos, String email, Puesto puesto, boolean activo){
		this.usuario = usuario;
		this.password = password;
		this.personal_datos = personal_datos;
		this.email = email;
		this.puesto = puesto;
		this.activo = activo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public PersonalDatos getPersonal_datos() {
		return personal_datos;
	}

	public void setPersonal_datos(PersonalDatos personal_datos) {
		this.personal_datos = personal_datos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", usuario=" + usuario + ", password="
				+ password + ", personalDatos=" + personal_datos + ", email="
				+ email + ", puesto=" + puesto + ", activo=" + activo + "]";
	}
}

package com.mx.CrudUsuarios.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIOS")

public class Usuarios {

	@Id
	@Column
	int idUsuarios;
	@Column
	String nombre;
	@Column
	String app;
	@Column
	int edad;
	@Column
	String email;

	public Usuarios() {
	}

	public Usuarios(int idUsuarios, String nombre, String app, int edad, String email) {
		this.idUsuarios = idUsuarios;
		this.nombre = nombre;
		this.app = app;
		this.edad = edad;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Usuarios [idUsuarios=" + idUsuarios + ", nombre=" + nombre + ", app=" + app + ", edad=" + edad
				+ ", email=" + email + "]\n";
	}

	public int getIdUsuarios() {
		return idUsuarios;
	}

	public void setIdUsuarios(int idUsuarios) {
		this.idUsuarios = idUsuarios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

package com.gestionvacaciones.model;

import java.util.Objects;

public class Usuario {
	private String nombreUsuario;
	private String clave;
	private String nombre;
	private String apellidos;
	private tipo tipoUsuario;
	
	public Usuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public Usuario(String nombreUsuario, String clave, String nombre, String apellidos, tipo tipoUsuario) {
		this.nombreUsuario = nombreUsuario;
		this.clave = clave;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.tipoUsuario = tipoUsuario;
	}

	public Usuario(tipo tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public tipo getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(tipo tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, clave, nombre, nombreUsuario, tipoUsuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Usuario))
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(clave, other.clave)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(nombreUsuario, other.nombreUsuario)
				&& tipoUsuario == other.tipoUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", clave=" + clave + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", tipoUsuario=" + tipoUsuario + "]";
	}
	
	
	
}

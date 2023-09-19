package com.gestionvacaciones.model;

import java.time.LocalDate;
import java.util.Objects;

public class Peticion {
	private int idPeticion;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private int año;
	private String comentario;
	private estado estadoPeticion;
	private Usuario usario;
	
	public Peticion() {
	}

	public Peticion(int idPeticion, LocalDate fechaInicio, LocalDate fechaFin, int año, String comentario,
			estado estadoPeticion, Usuario usario) {
		this.idPeticion = idPeticion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.año = año;
		this.comentario = comentario;
		this.estadoPeticion = estadoPeticion;
		this.usario = usario;
	}

	public Peticion(estado estadoPeticion) {
		this.estadoPeticion = estadoPeticion;
	}

	public int getIdPeticion() {
		return idPeticion;
	}

	public void setIdPeticion(int idPeticion) {
		this.idPeticion = idPeticion;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public estado getEstadoPeticion() {
		return estadoPeticion;
	}

	public void setEstadoPeticion(estado estadoPeticion) {
		this.estadoPeticion = estadoPeticion;
	}

	public Usuario getUsario() {
		return usario;
	}

	public void setUsario(Usuario usario) {
		this.usario = usario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(año, comentario, estadoPeticion, fechaFin, fechaInicio, idPeticion, usario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Peticion))
			return false;
		Peticion other = (Peticion) obj;
		return año == other.año && Objects.equals(comentario, other.comentario)
				&& estadoPeticion == other.estadoPeticion && Objects.equals(fechaFin, other.fechaFin)
				&& Objects.equals(fechaInicio, other.fechaInicio) && idPeticion == other.idPeticion
				&& Objects.equals(usario, other.usario);
	}

	@Override
	public String toString() {
		return "Peticion [idPeticion=" + idPeticion + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ ", año=" + año + ", comentario=" + comentario + ", estadoPeticion=" + estadoPeticion + ", usario="
				+ usario + "]";
	}
	
	
}

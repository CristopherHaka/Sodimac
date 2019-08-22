package com.sodimac.automation.model;

public class TablaModel {
	public String nombreBD;
	public String nombreEsquema;
	public String nombreTabla;
	public boolean existeTabla;
	
	public String getNombreBD() {
		return nombreBD;
	}
	public void setNombreBD(String nombreBD) {
		this.nombreBD = nombreBD;
	}
	public String getNombreEsquema() {
		return nombreEsquema;
	}
	public void setNombreEsquema(String nombreEsquema) {
		this.nombreEsquema = nombreEsquema;
	}
	public String getNombreTabla() {
		return nombreTabla;
	}
	public void setNombreTabla(String nombreTabla) {
		this.nombreTabla = nombreTabla;
	}
	public boolean isExisteTabla() {
		return existeTabla;
	}
	public void setExisteTabla(boolean existeTabla) {
		this.existeTabla = existeTabla;
	}
	
}

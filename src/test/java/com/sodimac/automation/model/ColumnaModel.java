package com.sodimac.automation.model;

public class ColumnaModel extends TablaModel {
	public String nombreColumna;
	public boolean isNull;
	public String tipoDato;
	public String maxLargo;
	public String numericoLargo;
	public String tipoConstraint;
	public String nombreTablaReferencia;
	public String nombreColumnaReferencia;
	
	public String getNombreColumna() {
		return nombreColumna;
	}
	public void setNombreColumna(String nombreColumna) {
		this.nombreColumna = nombreColumna;
	}
	public boolean isNull() {
		return isNull;
	}
	public void setNull(boolean isNull) {
		this.isNull = isNull;
	}
	public String getTipoDato() {
		return tipoDato;
	}
	public void setTipoDato(String tipoDato) {
		this.tipoDato = tipoDato;
	}
	public String getMaxLargo() {
		return maxLargo;
	}
	public void setMaxLargo(String maxLargo) {
		this.maxLargo = maxLargo;
	}
	public String getNumericoLargo() {
		return numericoLargo;
	}
	public void setNumericoLargo(String numericoLargo) {
		this.numericoLargo = numericoLargo;
	}
	public String getTipoConstraint() {
		return tipoConstraint;
	}
	public void setTipoConstraint(String tipoConstraint) {
		this.tipoConstraint = tipoConstraint;
	}
	public String getNombreTablaReferencia() {
		return nombreTablaReferencia;
	}
	public void setNombreTablaReferencia(String nombreTablaReferencia) {
		this.nombreTablaReferencia = nombreTablaReferencia;
	}
	public String getNombreColumnaReferencia() {
		return nombreColumnaReferencia;
	}
	public void setNombreColumnaReferencia(String nombreColumnaReferencia) {
		this.nombreColumnaReferencia = nombreColumnaReferencia;
	}
		

}

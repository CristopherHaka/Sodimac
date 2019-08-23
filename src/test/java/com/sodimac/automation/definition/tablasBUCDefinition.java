package com.sodimac.automation.definition;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.sodimac.automation.dao.ColumnaModelDAO;
import com.sodimac.automation.dao.TablaModelDAO;
import com.sodimac.automation.model.ColumnaModel;
import com.sodimac.automation.model.TablaModel;
import com.sodimac.automation.util.Constans;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class tablasBUCDefinition {
	public static TablaModel tabla = new TablaModel();
	public static ColumnaModel columna = new ColumnaModel();

	@When("^Consulto si existe en el esquema\"([^\"]*)\" la tabla\"([^\"]*)\"$")
	public void consulto_si_existe_en_el_esquema_la_tabla(String nombreEsquema, String nombreTabla) throws Throwable {
		tabla.setNombreEsquema(nombreEsquema.toLowerCase());
		tabla.setNombreTabla(nombreTabla.toUpperCase());
		tabla.setExisteTabla(TablaModelDAO.getExistTableByNameTable(tabla));
	}



	@Then("^valido que la tabla exista en BD$")
	public void valido_que_la_tabla_exista_en_BD() throws Throwable {
	   assertTrue("La tabla "+tabla.getNombreTabla() + " no se encuentra en el modelo de Datos",tabla.isExisteTabla());
	}

	
	
	@When("^realizo consulta de la PK\"([^\"]*)\" en la tabla\"([^\"]*)\"$")
	public void realizo_consulta_de_la_PK_en_la_tabla(String nombrePK, String nombreTabla) throws Throwable {
		columna.setNombreEsquema(Constans.nombre_esquema_buc.toLowerCase());
		columna.setNombreBD(Constans.nombre_bd_buc.toUpperCase());
		columna.setNombreTabla(nombreTabla.toUpperCase());
		columna.setNombreColumna(nombrePK.toUpperCase());
		columna.setExisteTabla(ColumnaModelDAO.getPkTableByNameTable(columna));
	
	}

	@Then("^valido constraint PK$")
	public void valido_constraint_PK() throws Throwable {
		 assertTrue("El Campo "+columna.getNombreColumna() + " no esta creado como PK de la tabla "+ columna.getNombreTabla(),columna.isExisteTabla());
	}

	@When("^realizo consulta del campo FK\"([^\"]*)\" en la tabla\"([^\"]*)\"$")
    public void realizo_consulta_del_campo_FK_en_la_tabla(String nombreFK, String nombreTabla) throws Throwable {
		columna = new ColumnaModel();
		columna.setNombreEsquema(Constans.nombre_esquema_buc.toLowerCase());
		columna.setNombreBD(Constans.nombre_bd_buc.toUpperCase());
		columna.setNombreTabla(nombreTabla.toUpperCase());
		columna.setNombreColumna(nombreFK.toUpperCase());
		columna.setNombreTablaReferencia(ColumnaModelDAO.getFkTableByNameTable(columna));
		if(!columna.getNombreTablaReferencia().equals(""))
		{
			columna.setNombreTabla(columna.getNombreTablaReferencia());
			columna.setExisteTabla(ColumnaModelDAO.getPkTableByNameTable(columna));
		}
		
    }

	@Then("^valido que el campo FK sea PK en la tabla primaria$")
	public void valido_que_el_campo_FK_sea_PK_en_la_tabla_primaria() throws Throwable {
		if(columna.getNombreTablaReferencia().equals("")) {
			assertFalse("El Campo "+columna.getNombreColumna() + " no esta creado como FK de la tabla "+ columna.getNombreTabla(), true);	
		}
		else {
			assertTrue("El Campo "+columna.getNombreColumna() + " no esta creado como PK de la tabla "+  columna.getNombreTabla(),columna.isExisteTabla());
		}
     }

	@When("^realizo consulta de campo\"([^\"]*)\" en la table\"([^\"]*)\"$")
	public void realizo_consulta_de_campo_en_la_table(String nombreCampo, String nombreTabla) throws Throwable {
		columna = new ColumnaModel();
		columna.setNombreEsquema(Constans.nombre_esquema_buc.toLowerCase());
		columna.setNombreBD(Constans.nombre_bd_buc.toUpperCase());
		columna.setNombreTabla(nombreTabla.toUpperCase());
		columna.setNombreColumna(nombreCampo.toUpperCase());
		columna.setCampoNulleable(ColumnaModelDAO.getNotNullTableByNameTable(columna));
		
	}

	@Then("^valido que el campo sea obligatorio$")
	public void valido_que_el_campo_sea_obligatorio() throws Throwable {
		if(columna.getCampoNulleable().equals("")) {
			assertFalse("El Campo "+columna.getNombreColumna() + " no esta creado en la tabla "+ columna.getNombreTabla(), true);	
		}
		else {
			assertTrue("El Campo "+columna.getNombreColumna() + " debe ser obligatorio (isNullable = 'NO') en la tabla "+  columna.getNombreTabla(), columna.getCampoNulleable().equals("NO"));
		}
	}



}

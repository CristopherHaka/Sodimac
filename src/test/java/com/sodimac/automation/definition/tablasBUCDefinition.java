package com.sodimac.automation.definition;

import static org.junit.Assert.assertTrue;

import com.sodimac.automation.dao.ColumnaModelDAO;
import com.sodimac.automation.dao.TablaModelDAO;
import com.sodimac.automation.model.ColumnaModel;
import com.sodimac.automation.model.TablaModel;
import com.sodimac.automation.util.Constans;

import cucumber.api.PendingException;
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
		columna.setNombreEsquema(Constans.nombre_esquema_buc.toLowerCase());
		columna.setNombreBD(Constans.nombre_bd_buc.toUpperCase());
		columna.setNombreTabla(nombreTabla.toUpperCase());
		columna.setNombreColumna(nombreFK.toUpperCase());
		columna.setNombreTablaReferencia(ColumnaModelDAO.getFkTableByNameTable(columna));
		System.out.println("la colooo" + columna.getNombreTablaReferencia().toString());
		if(columna.getNombreTablaReferencia() != "")
		{
			columna.setNombreTabla(columna.getNombreTablaReferencia());
		}
			
			
		
    }

	@Then("^valido que el campo FK sea PK en la tabla primaria$")
	public void valido_que_el_campo_FK_sea_PK_en_la_tabla_primaria() throws Throwable {
    
    throw new PendingException();
}


}

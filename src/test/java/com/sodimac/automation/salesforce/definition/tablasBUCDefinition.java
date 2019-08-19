package com.sodimac.automation.salesforce.definition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class tablasBUCDefinition {
	@When("^Consulto si existe la tabla \"([^\"]*)\"$")
	public void consulto_si_existe_la_tabla(String tablename) throws Throwable {
	    
	}

	@Then("^valido que el objeto exista en BD$")
	public void valido_que_el_objeto_exista_en_BD() throws Throwable {
	    
	}

	@When("^realizo consulta de la tabla maestra \"([^\"]*)\"$")
	public void realizo_consulta_de_la_tabla_maestra(String tablename) throws Throwable {
	   
	}

	@Then("^valido que tenga registros$")
	public void valido_que_tenga_registros() throws Throwable {
	   
	}

	@When("^realizo consulta de PK la tabla  \"([^\"]*)\"$")
	public void realizo_consulta_de_PK_la_tabla(String tablename) throws Throwable {
	   
	}

	@Then("^valido que no tenga campos PK repetidos\\.$")
	public void valido_que_no_tenga_campos_PK_repetidos() throws Throwable {
	   
	}

	@When("^realizo consulta de la tabla \"([^\"]*)\"$")
	public void realizo_consulta_de_la_tabla(String tablename) throws Throwable {
	    
	}

	@Then("^valido que los campos obligatorios tengas valores$")
	public void valido_que_los_campos_obligatorios_tengas_valores() throws Throwable {
	    
	}

	@When("^realizo consulta de la tabla address y hierarchy_address$")
	public void realizo_consulta_de_la_tabla_address_y_hierarchy_address() throws Throwable {
	   
	}

	@Then("^valido que el arreglo address tenga los niveles indicados en la tabla hierarchy_address$")
	public void valido_que_el_arreglo_address_tenga_los_niveles_indicados_en_la_tabla_hierarchy_address() throws Throwable {
	   
	}

	@When("^realizo consulta del campo FK en la tabla \"([^\"]*)\"$")
	public void realizo_consulta_del_campo_FK_en_la_tabla(String tablename) throws Throwable {
	    
	}

	@When("^realizo consulta del PK en las tablas primarias$")
	public void realizo_consulta_del_PK_en_las_tablas_primarias() throws Throwable {
	   
	}

	@Then("^valido que el campo FK  se encuentre en el campo PK de las tablas primarias$")
	public void valido_que_el_campo_FK_se_encuentre_en_el_campo_PK_de_las_tablas_primarias() throws Throwable {
	    
	}

	@When("^realizo consulta de clientes pasando los filtros \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void realizo_consulta_de_clientes_pasando_los_filtros(String country, String type, String value) throws Throwable {
	    
	}

	@Then("^valido que devuelva los datos a mostrar en la vista$")
	public void valido_que_devuelva_los_datos_a_mostrar_en_la_vista() throws Throwable {
	    
	}

	@When("^realizo consulta de contacto de clientes pasando los filtros \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void realizo_consulta_de_contacto_de_clientes_pasando_los_filtros(String country, String type, String value) throws Throwable {
	   
	}

	@When("^realizo consulta de direcciones de clientes pasando los filtros \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void realizo_consulta_de_direcciones_de_clientes_pasando_los_filtros(String country, String type, String value) throws Throwable {
	  
	}

	@When("^realizo consulta de contact_method pasando los filtros \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void realizo_consulta_de_contact_method_pasando_los_filtros(String country, String type, String value) throws Throwable {
	    
	}



}

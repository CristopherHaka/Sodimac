package com.sodimac.automation.definition;

import com.sodimac.automation.dao.CustomerDAO;
import com.sodimac.automation.model.Customer;

import cucumber.api.java.en.When;

public class ConsultaDefinition {


	@When("^Realizo consulta a customer$")
	public void realizo_consulta_a_customer() throws Throwable {
		Customer cus = CustomerDAO.getCustomerById(2L);
		System.out.println(cus.getName());
	}
}

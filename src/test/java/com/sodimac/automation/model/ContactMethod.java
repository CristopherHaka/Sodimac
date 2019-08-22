package com.sodimac.automation.model;

public class ContactMethod {
	public int id;
	public String type;
	public int customer_id;
	public int contact_id;
	public String value;
	public boolean principal_contact_method;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getContact_id() {
		return contact_id;
	}
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public boolean isPrincipal_contact_method() {
		return principal_contact_method;
	}
	public void setPrincipal_contact_method(boolean principal_contact_method) {
		this.principal_contact_method = principal_contact_method;
	}
	

}

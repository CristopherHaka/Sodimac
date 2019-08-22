package com.sodimac.automation.model;

import java.util.Date;

public class Contact {
	public int contact_id;
	public int customer_id;
	public String name;
	public String surname;
	public String identifier_type;
	public String identifier_value;
	public String gender;
	public String ocupation;
	public Date birthday;
	public String nacionality;
	public String role;
	public boolean subscribed;
	
	public int getContact_id() {
		return contact_id;
	}
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getIdentifier_type() {
		return identifier_type;
	}
	public void setIdentifier_type(String identifier_type) {
		this.identifier_type = identifier_type;
	}
	public String getIdentifier_value() {
		return identifier_value;
	}
	public void setIdentifier_value(String identifier_value) {
		this.identifier_value = identifier_value;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getOcupation() {
		return ocupation;
	}
	public void setOcupation(String ocupation) {
		this.ocupation = ocupation;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getNacionality() {
		return nacionality;
	}
	public void setNacionality(String nacionality) {
		this.nacionality = nacionality;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isSubscribed() {
		return subscribed;
	}
	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}
	
}

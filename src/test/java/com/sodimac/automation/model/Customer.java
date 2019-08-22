package com.sodimac.automation.model;

import java.util.Date;
import java.util.List;

public class Customer {
	public int customer_id;
	public String name;
	public String customer_type;
	public String fantasy_name;
	public boolean quality;
	public String source_registration;
	public Date registration_date;
	public String parent;
	public String surname;
	public String gender;
	public String ocupation;
	public Date birthday;
	public boolean subscribed;
	public boolean active;
	public List <Address> listAdrress;
	public String table_name;
	
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
	public String getCustomer_type() {
		return customer_type;
	}
	public void setCustomer_type(String customer_type) {
		this.customer_type = customer_type;
	}
	public String getFantasy_name() {
		return fantasy_name;
	}
	public void setFantasy_name(String fantasy_name) {
		this.fantasy_name = fantasy_name;
	}
	public boolean isQuality() {
		return quality;
	}
	public void setQuality(boolean quality) {
		this.quality = quality;
	}
	public String getSource_registration() {
		return source_registration;
	}
	public void setSource_registration(String source_registration) {
		this.source_registration = source_registration;
	}
	public Date getRegistration_date() {
		return registration_date;
	}
	public void setRegistration_date(Date registration_date) {
		this.registration_date = registration_date;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
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
	public boolean isSubscribed() {
		return subscribed;
	}
	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public List<Address> getListAdrress() {
		return listAdrress;
	}
	public void setListAdrress(List<Address> listAdrress) {
		this.listAdrress = listAdrress;
	}
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	
	
	
}

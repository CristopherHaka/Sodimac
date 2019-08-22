package com.sodimac.automation.model;

import java.sql.Timestamp;

public class AuditTrail {
	public int audit_id;
	public String customer_identifier;
	public String value;
	public Timestamp creation_date;
	public Timestamp last_update;
	public char status;
	public String rejection_reason;
	public String system;
	public String country;
	public String user_update;
	
	public int getAudit_id() {
		return audit_id;
	}
	public void setAudit_id(int audit_id) {
		this.audit_id = audit_id;
	}
	public String getCustomer_identifier() {
		return customer_identifier;
	}
	public void setCustomer_identifier(String customer_identifier) {
		this.customer_identifier = customer_identifier;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Timestamp getCreation_date() {
		return creation_date;
	}
	public void setCreation_date(Timestamp creation_date) {
		this.creation_date = creation_date;
	}
	public Timestamp getLast_update() {
		return last_update;
	}
	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public String getRejection_reason() {
		return rejection_reason;
	}
	public void setRejection_reason(String rejection_reason) {
		this.rejection_reason = rejection_reason;
	}
	public String getSystem() {
		return system;
	}
	public void setSystem(String system) {
		this.system = system;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getUser_update() {
		return user_update;
	}
	public void setUser_update(String user_update) {
		this.user_update = user_update;
	}
	
	
}

package com.sodimac.automation.model;

import java.sql.Timestamp;
import java.util.Date;

public class Address {
	public int address_id;
	public int customer_id;
	public String address;
	public String street;
	public String zip_code;
	public boolean principal_address;
	public String country;
	public Date created_date;
	public Timestamp last_update;
	
}

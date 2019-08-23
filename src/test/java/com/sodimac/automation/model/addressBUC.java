package com.sodimac.automation.model;

import java.sql.Timestamp;
import java.util.Date;

public final class addressBUC {
	public static int addressIdPK;
	public static int customerIdFK;
	public static String[] address;
	public static String street;
	public static String zipCode;
	public static boolean principalAddress;
	public static String country;
	public static Date createdDate;
	public static Timestamp lastUpdate;
	
	public static int getAddressIdPK() {
		return addressIdPK;
	}
	public static void setAddressIdPK(int addressIdPK) {
		addressBUC.addressIdPK = addressIdPK;
	}
	public static int getCustomerIdFK() {
		return customerIdFK;
	}
	public static void setCustomerIdFK(int customerIdFK) {
		addressBUC.customerIdFK = customerIdFK;
	}
	public static String[] getAddress() {
		return address;
	}
	public static void setAddress(String[] address) {
		addressBUC.address = address;
	}
	public static String getStreet() {
		return street;
	}
	public static void setStreet(String street) {
		addressBUC.street = street;
	}
	public static String getZipCode() {
		return zipCode;
	}
	public static void setZipCode(String zipCode) {
		addressBUC.zipCode = zipCode;
	}
	public static boolean isPrincipalAddress() {
		return principalAddress;
	}
	public static void setPrincipalAddress(boolean principalAddress) {
		addressBUC.principalAddress = principalAddress;
	}
	public static String getCountry() {
		return country;
	}
	public static void setCountry(String country) {
		addressBUC.country = country;
	}
	public static Date getCreatedDate() {
		return createdDate;
	}
	public static void setCreatedDate(Date createdDate) {
		addressBUC.createdDate = createdDate;
	}
	public static Timestamp getLastUpdate() {
		return lastUpdate;
	}
	public static void setLastUpdate(Timestamp lastUpdate) {
		addressBUC.lastUpdate = lastUpdate;
	}
	
}

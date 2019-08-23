package com.sodimac.automation.model;

public final class customerIdentifierBUC {
	public static String countryPK;
	public static String typePK;
	public static String valuePK;
	public static int customerIdFK;
	
	public static String getCountryPK() {
		return countryPK;
	}
	public static void setCountryPK(String countryPK) {
		customerIdentifierBUC.countryPK = countryPK;
	}
	public static String getTypePK() {
		return typePK;
	}
	public static void setTypePK(String typePK) {
		customerIdentifierBUC.typePK = typePK;
	}
	public static String getValuePK() {
		return valuePK;
	}
	public static void setValuePK(String valuePK) {
		customerIdentifierBUC.valuePK = valuePK;
	}
	public static int getCustomerIdFK() {
		return customerIdFK;
	}
	public static void setCustomerIdFK(int customerIdFK) {
		customerIdentifierBUC.customerIdFK = customerIdFK;
	}

}

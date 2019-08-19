package com.sodimac.automation.model;

public final class contactMethodBUC {
	public static int idPK;
	public static String typePK;
	public static int customerIdFK;
	public static int contactIdFK;
	public static String[] value;
	
	public static int getIdPK() {
		return idPK;
	}
	public static void setIdPK(int idPK) {
		contactMethodBUC.idPK = idPK;
	}
	public static String getTypePK() {
		return typePK;
	}
	public static void setTypePK(String typePK) {
		contactMethodBUC.typePK = typePK;
	}
	public static int getCustomerIdFK() {
		return customerIdFK;
	}
	public static void setCustomerIdFK(int customerIdFK) {
		contactMethodBUC.customerIdFK = customerIdFK;
	}
	public static int getContactIdFK() {
		return contactIdFK;
	}
	public static void setContactIdFK(int contactIdFK) {
		contactMethodBUC.contactIdFK = contactIdFK;
	}
	public static String[] getValue() {
		return value;
	}
	public static void setValue(String[] value) {
		contactMethodBUC.value = value;
	}
}

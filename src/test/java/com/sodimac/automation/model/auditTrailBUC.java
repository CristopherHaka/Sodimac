package com.sodimac.automation.salesforce.model;

import java.sql.Timestamp;

public final class auditTrailBUC {
	public static int auditIdPK;
	public static String customerIdentifier;
	public static String value;
	public static Timestamp creationDate;
	public static Timestamp lastUpdate;
	public static String status;
	public static String[] rejectionReason;
	public static String system;
	public static String country;
	public static String userUpdate;
	public static int getAuditIdPK() {
		return auditIdPK;
	}
	public static void setAuditIdPK(int auditIdPK) {
		auditTrailBUC.auditIdPK = auditIdPK;
	}
	public static String getCustomerIdentifier() {
		return customerIdentifier;
	}
	public static void setCustomerIdentifier(String customerIdentifier) {
		auditTrailBUC.customerIdentifier = customerIdentifier;
	}
	public static String getValue() {
		return value;
	}
	public static void setValue(String value) {
		auditTrailBUC.value = value;
	}
	public static Timestamp getCreationDate() {
		return creationDate;
	}
	public static void setCreationDate(Timestamp creationDate) {
		auditTrailBUC.creationDate = creationDate;
	}
	public static Timestamp getLastUpdate() {
		return lastUpdate;
	}
	public static void setLastUpdate(Timestamp lastUpdate) {
		auditTrailBUC.lastUpdate = lastUpdate;
	}
	public static String getStatus() {
		return status;
	}
	public static void setStatus(String status) {
		auditTrailBUC.status = status;
	}
	public static String[] getRejectionReason() {
		return rejectionReason;
	}
	public static void setRejectionReason(String[] rejectionReason) {
		auditTrailBUC.rejectionReason = rejectionReason;
	}
	public static String getSystem() {
		return system;
	}
	public static void setSystem(String system) {
		auditTrailBUC.system = system;
	}
	public static String getCountry() {
		return country;
	}
	public static void setCountry(String country) {
		auditTrailBUC.country = country;
	}
	public static String getUserUpdate() {
		return userUpdate;
	}
	public static void setUserUpdate(String userUpdate) {
		auditTrailBUC.userUpdate = userUpdate;
	}
	
	
}

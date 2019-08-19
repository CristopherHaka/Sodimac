package com.sodimac.automation.salesforce.model;

import java.util.Date;

public final class contactBUC {
	public static int contactIdPK;
	public static int customerIdFK;
	public static String name;
	public static String surname;
	public static boolean foreing;
	public static String identifierType;
	public static String identifierValue;
	public static String gender;
	public static String ocupation;
	public static Date birthday;
	public static String nacionality;
	public static String role;
	public static boolean subscribed;
	
	public static int getContactIdPK() {
		return contactIdPK;
	}
	public static void setContactIdPK(int contactIdPK) {
		contactBUC.contactIdPK = contactIdPK;
	}
	public static int getCustomerIdFK() {
		return customerIdFK;
	}
	public static void setCustomerIdFK(int customerIdFK) {
		contactBUC.customerIdFK = customerIdFK;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		contactBUC.name = name;
	}
	public static String getSurname() {
		return surname;
	}
	public static void setSurname(String surname) {
		contactBUC.surname = surname;
	}
	public static boolean isForeing() {
		return foreing;
	}
	public static void setForeing(boolean foreing) {
		contactBUC.foreing = foreing;
	}
	public static String getIdentifierType() {
		return identifierType;
	}
	public static void setIdentifierType(String identifierType) {
		contactBUC.identifierType = identifierType;
	}
	public static String getIdentifierValue() {
		return identifierValue;
	}
	public static void setIdentifierValue(String identifierValue) {
		contactBUC.identifierValue = identifierValue;
	}
	public static String getGender() {
		return gender;
	}
	public static void setGender(String gender) {
		contactBUC.gender = gender;
	}
	public static String getOcupation() {
		return ocupation;
	}
	public static void setOcupation(String ocupation) {
		contactBUC.ocupation = ocupation;
	}
	public static Date getBirthday() {
		return birthday;
	}
	public static void setBirthday(Date birthday) {
		contactBUC.birthday = birthday;
	}
	public static String getNacionality() {
		return nacionality;
	}
	public static void setNacionality(String nacionality) {
		contactBUC.nacionality = nacionality;
	}
	public static String getRole() {
		return role;
	}
	public static void setRole(String role) {
		contactBUC.role = role;
	}
	public static boolean isSubscribed() {
		return subscribed;
	}
	public static void setSubscribed(boolean subscribed) {
		contactBUC.subscribed = subscribed;
	}
}

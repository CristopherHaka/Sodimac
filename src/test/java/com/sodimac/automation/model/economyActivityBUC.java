package com.sodimac.automation.salesforce.model;

public final class economyActivityBUC {
	public static int economyActivityCodePK;
	public static String type;
	public static String country;
	
	public static int getEconomyActivityCodePK() {
		return economyActivityCodePK;
	}
	public static void setEconomyActivityCodePK(int economyActivityCodePK) {
		economyActivityBUC.economyActivityCodePK = economyActivityCodePK;
	}
	public static String getType() {
		return type;
	}
	public static void setType(String type) {
		economyActivityBUC.type = type;
	}
	public static String getCountry() {
		return country;
	}
	public static void setCountry(String country) {
		economyActivityBUC.country = country;
	}

}

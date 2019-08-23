package com.sodimac.automation.dao;


import com.sodimac.automation.config.BaseFlow;
import com.sodimac.automation.model.ColumnaModel;

public class ColumnaModelDAO {
	
	public static Boolean getPkTableByNameTable(ColumnaModel colummna) throws Exception {
		Boolean valid= false;
		Long valor = 0L;
		try {
			valor = (Long) BaseFlow.sqlMap.queryForObject("getPkTableByNameTable",  colummna);
			valid = valor==1?true:false;
		} catch (Exception e) {
			//throw e;
		}
		return valid;
	}
	public static String getFkTableByNameTable(ColumnaModel colummna) throws Exception {
		String valor = "";
		try {
			valor = (String) BaseFlow.sqlMap.queryForObject("getFkTableByNameTable",  colummna);
			
		} catch (Exception e) {
		//	throw e;
		}
		if (valor == null)
		    valor = "";
		return valor;
	}
	public static String getNotNullTableByNameTable(ColumnaModel colummna) throws Exception {
		String valor = "";
		try {
			valor = (String) BaseFlow.sqlMap.queryForObject("getNotNullTableByNameTable",  colummna);
			
		} catch (Exception e) {
		//	throw e;
		}
		if (valor == null)
		    valor = "";
		return valor;
	}
	
}

package com.sodimac.automation.dao;


import java.sql.SQLException;

import com.sodimac.automation.flow.BaseFlow;
import com.sodimac.automation.model.ColumnaModel;

public class ColumnaModelDAO {
	
	public static Boolean getPkTableByNameTable(ColumnaModel colummna) throws SQLException {
		Boolean valid= false;
		Long valor = 0L;
		try {
			valor = (Long) BaseFlow.sqlMap.queryForObject("getPkTableByNameTable",  colummna);
			valid = valor==1?true:false;
		} catch (Exception e) {
			throw e;
		}
		return valid;
	}
	public static String getFkTableByNameTable(ColumnaModel colummna) throws SQLException {
		String valor = "";
		try {
			valor = (String) BaseFlow.sqlMap.queryForObject("getFkTableByNameTable",  colummna);
			
		} catch (Exception e) {
			throw e;
		}
		if (valor == null)
		    valor = "";
		return valor;
	}
	
}

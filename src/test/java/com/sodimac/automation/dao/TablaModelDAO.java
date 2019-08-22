package com.sodimac.automation.dao;


import java.sql.SQLException;

import com.sodimac.automation.flow.BaseFlow;
import com.sodimac.automation.model.TablaModel;

public class TablaModelDAO {
	
	public static Boolean getExistTableByNameTable(TablaModel tabla) throws SQLException {
		Boolean valid= false;
		Long valor = 0L;
		try {
			valor = (Long) BaseFlow.sqlMap.queryForObject("getExistTableByNameTable",  tabla);
			valid = valor==1?true:false;
		} catch (Exception e) {
			throw e;
		}
		return valid;
	}
	
}

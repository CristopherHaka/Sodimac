package com.sodimac.automation.dao;

import java.sql.SQLException;

import com.sodimac.automation.flow.BaseFlow;
import com.sodimac.automation.model.Customer;

public class CustomerDAO {

	public static Customer getCustomerById(Long customer_id) throws SQLException {
//		BaseFlow.sqlMap.openSession();
		Customer customer =    (Customer) BaseFlow.sqlMap.queryForObject("getCustomerById", customer_id);
		return customer;
	}
	
}

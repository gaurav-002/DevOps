package com.lti.dao;

import java.sql.SQLException;
import java.util.List;

import com.lti.bean.Customer;

public interface CustomerDao {
	
	public List<Customer> viewAllCustomer() throws SQLException;
	public Customer viewCustomer(int custId) throws SQLException;
	public int deleteCustomer(int custId) throws SQLException;
	public int addCustomer(int custId, String name, double balance) throws SQLException;
}

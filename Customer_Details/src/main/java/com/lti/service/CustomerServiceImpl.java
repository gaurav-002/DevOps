package com.lti.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lti.bean.Customer;
import com.lti.dao.CustomerDao;
import com.lti.dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {

	CustomerDao dao = null;
	
	public CustomerServiceImpl() throws ClassNotFoundException, SQLException{
		dao = new CustomerDaoImpl();
	}
	
	@Override
	public List<Customer> viewAllCustomer() throws SQLException {
		List<Customer> customerList = new ArrayList<Customer>();
		customerList = dao.viewAllCustomer();
		
		return customerList;
	}

	@Override
	public Customer viewCustomer(int custId) throws SQLException {
		
		Customer cust = new Customer();
		cust = dao.viewCustomer(custId);
		return cust;
	}

	@Override
	public int deleteCustomer(int custId) throws SQLException {
		int result = dao.deleteCustomer(custId);
		
		return result;
		
	}

	@Override
	public int addCustomer(int custId, String name, double balance) throws SQLException {
		int result = dao.addCustomer(custId,name,balance);		
		return result;
	
	}

}

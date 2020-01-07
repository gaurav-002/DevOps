package com.lti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.lti.bean.Customer;
import com.lti.util.DbUtil;

public class CustomerDaoImpl implements CustomerDao {

	Connection conn = null;
	DbUtil dbconn = null;
	public CustomerDaoImpl(){
			dbconn = new DbUtil();
			conn = dbconn.getDataSource();	
		}

	@Override
	public List<Customer> viewAllCustomer() throws SQLException {
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("Select * from Customer_Detail");
		List<Customer> customerList = new ArrayList<Customer>();
		while(rs.next()){
			customerList.add(new Customer( rs.getInt(1), rs.getString(2), rs.getDouble(3)));
		}
		
		return customerList;
	}

	@Override
	public Customer viewCustomer(int custId) throws SQLException {
		Customer cust = new Customer();
		String sql = ("Select * from Customer_Detail where cust_Id = ?");
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, custId);		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()){
			cust.setCust_id(rs.getInt(1));
			cust.setName(rs.getString(2));
			cust.setBalance(rs.getDouble(3));
		}
		
		return cust;
	}

	@Override
	public int deleteCustomer(int custId) throws SQLException {
		String sql = "Delete from Customer_detail where cust_Id = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, custId);		
		int result = ps.executeUpdate();	
		return result;
		
		
		
		
		
		
		
	}

	@Override
	public int addCustomer(int custId, String name, double balance) throws SQLException {
		String sql = "insert into Customer_Detail(cust_id,name,balance) values(?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, custId);
		ps.setString(2, name);
		ps.setDouble(3, balance);		
		int result = ps.executeUpdate();
		return result;
		
		
	}

}

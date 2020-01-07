package com.lti;

import java.sql.SQLException;

import com.lti.service.CustomerService;
import com.lti.service.CustomerServiceImpl;

public class Main {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		CustomerService custService = new CustomerServiceImpl();
		
		System.out.println(custService.viewAllCustomer());
		
		System.out.println(custService.viewCustomer(103));
		
		int result = (custService.deleteCustomer(101));
		System.out.println(result);
		if(result != 0){
			System.out.println("No of Rows affected : " +result);
		}
		else{
			System.out.println("Error");
		}
		
		int result1 = custService.addCustomer(105, "Sumit", 35000);
		if(result1 != 0 ){
			System.out.println("No of Rows affected : " +result1);
		}
		else{
			System.out.println("Error");
		}
		
	}

}

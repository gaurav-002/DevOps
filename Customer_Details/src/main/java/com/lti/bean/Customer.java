package com.lti.bean;

public class Customer {
	
	
	private int cust_Id;
	private String name;
	private double balance;
	
	
	public Customer() {
	}


	public Customer(int cust_id, String name, double balance) {
		this.cust_Id = cust_id;
		this.name = name;
		this.balance = balance;
	}


	public int getCust_id() {
		return cust_Id;
	}


	public void setCust_id(int cust_id) {
		this.cust_Id = cust_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_Id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
	
	

}

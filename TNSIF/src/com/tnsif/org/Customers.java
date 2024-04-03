package com.tnsif.org;

public class Customers {

	private int customerId;
	private String customerName;
	private String customerCity;
	
	
	//default Constructor
	public Customers() 
	{
		System.out.println("Hi Friends! I am Constructor");
	}
	
	
	//Parameterized  Constructor
	public Customers(int customerId, String customerName, String customerCity) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerCity = customerCity;
	}
	
	
	// Setting getters and setters
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}


	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
				+ customerCity ;

	}
	
	
	
}

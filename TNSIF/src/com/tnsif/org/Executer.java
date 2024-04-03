package com.tnsif.org;

import java.util.Scanner;

public class Executer {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		int id = sc.nextInt();
		
		System.out.println("Enter Customer name");
		String name= sc.next();
		
		System.out.println("Enter Customer City");
		String city= sc.next();
		
		Customers c1=new Customers();
		
		c1.setCustomerId(id);
		c1.setCustomerName(name);
		c1.setCustomerCity(city);

		System.out.println("Customer Details"+c1.toString());
		
		sc.close();
	}

}

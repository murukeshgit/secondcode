package org.test.constructormethod;

public class Company {
		public Company() {
			this("wipro",687542125l);
		System.out.println("Parent default construtor");
		}
		public Company(int id) {
			this();
			System.out.println("Company id is :"+id);
		}
		public Company(String name ,long mobileno) {
			
			System.out.println("Company name is :"+name +"\tcompany mobile no :"+mobileno);
			
		}
}

package org.test.constructormethod;

public class Sample extends Company {
		
public Sample() {
	this(8532147862l,"muru1522@gmail.com");
	System.out.println("Default Constructor");
	 } 
public Sample(String name) {
	this("muru1522@",546879521l);
	System.out.println("Employee name :"+name);	
	 }
public Sample(String email,long phno) {
	this ();
	System.out.println("Employee emailid :"+email+"\nEmployee phno :"+phno);
}
public Sample(long phno,String email) {
	super(1522);
	System.out.println("Employee alter phno :"+phno+"\tEmployee alter email :"+email);
}

	public static void main(String[] args) {
//		Sample e =new Sample();
//		Sample e1= new Sample("Murukesh");
		Sample e2= new Sample("muru1522@gmail.com",8764218909l);
//		Sample e3 =new Sample(6892456798l,"muru324@gmail.com");
		
	}
}

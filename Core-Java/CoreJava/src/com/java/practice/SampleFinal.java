package com.java.practice;

public class SampleFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	try{
		int a= 10, b = 0;
		int c = a/b;
		System.out.println("C = "+c);
	}catch(ArithmeticException e) {
		e.printStackTrace();
		System.out.println("Exception e - "+e.toString());
	}
	System.out.println("Try catch concept");

}
}


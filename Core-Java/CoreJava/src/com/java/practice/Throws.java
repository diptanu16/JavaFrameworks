package com.java.practice;

public class Throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new NullPointerException("Manually Thrown");
			
		}catch(NullPointerException e) {
			System.out.println("Exception caught : "+e.toString());
		}
		
		}
	void sampleMethod() throws IllegalAccessException {
		throw new IllegalAccessException("From Method");
	}

}

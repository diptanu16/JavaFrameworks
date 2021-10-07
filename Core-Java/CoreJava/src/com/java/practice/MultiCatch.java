package com.java.practice;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sampleMethod();
	}
	
	static void sampleMethod() {
		try {
			System.out.println("Normaal");
			return;
		}finally {
			System.out.println("Runs after return");
		}
		
	}
	
}

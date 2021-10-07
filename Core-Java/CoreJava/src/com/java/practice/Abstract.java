package com.java.practice;

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boss  b = new Boss();
		b.callMeNow();
		
	}

}

abstract class A{
	void callMe() {
		System.out.println("From callme");
	}
	
	abstract void callMeNow();
}
class Boss extends A{
	
	void callMeNow() {
		System.out.println("Can you call me now");
	}
}
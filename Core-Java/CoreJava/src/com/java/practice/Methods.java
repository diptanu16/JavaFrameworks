package com.java.practice;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 23;
		int y = 8;
		int z = 32;
		System.out.println("Volume is: "+volume(x,y,z));
		printSomething();
		String myname = myName("Diptanu");
		System.out.println(myname);
		
		int[]values = {0,1,4,5};
		
		printList(3,values);
	}
	
	static int volume(int x,int y, int z) {
		return x*y*z;
	}
	static void printSomething() {
		System.out.println("Something is printed");
	}
	static String myName(String name) {
		return "My Name is "+name;
	}
	static void printList(int limit,int[]values) {
		for(int i =0;i<limit;i++) {
			System.out.println(values[i]);
		}
	}

}

package com.java.practice;

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.printVar(54,45,14);
		test.printVar(true);
		int[] array1 = {2,23,56};
		test.printVarw(array1);

		
	}
 }

class Test{
	void printVar(int...v) {
		for(int x:v) {
		System.out.println(x);
	}
	}
	void printVar(boolean... v) {
		for(boolean x :v) {
			System.out.println(x);
		}
	}
	void printVarw(int [] f) {
		for(int x :f) {
			System.out.println(x);
		}
	}

}


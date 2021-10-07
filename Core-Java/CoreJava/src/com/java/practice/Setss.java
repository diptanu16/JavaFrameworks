package com.java.practice;

import java.util.Set;
import java.util.TreeSet;

public class Setss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<String> s = new TreeSet<String>(new MyComp());
		
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("E");
		
		System.out.println(s);
		
		System.out.println(s.subSet("C", "A"));
		

	}

}

package com.java.practice;

import java.util.Comparator;

public class MyComp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		String str1 = o1;
		String str2 = o2;
		
		return str2.compareTo(str1);
	}

}

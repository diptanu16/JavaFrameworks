package com.java.practice;

import java.util.Iterator;
import java.util.LinkedList;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 10;
		Integer iob = new Integer(12);
		
		String sNum = "10";
		Integer i = Integer.valueOf(sNum);//wrappingUp
		//System.out.println(i);
		
		Integer nob = 14;//autoboxing
		int h =nob;//autoUNboxing
		
		
		//collection framework//Iterator,fro each loop andlist iterator
		LinkedList<Integer> li = new LinkedList<>();
		li.add(1);
		li.add(7);  
		li.add(41);
		li.add(12);
		
		for(Integer w : li) 
			System.out.println(w);
		
		Iterator k = li.iterator();
		 while(k.hasNext()) {
			 int x = Integer.valueOf(k.next().toString());
			 if(x%2 == 0) {
				 k.remove();
			 }
				 
		 }
		
		 System.out.println(li);
		
	}

}

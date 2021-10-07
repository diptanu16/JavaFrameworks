package com.hibernate.entity;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();


		//create session

		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			
			   ArrayList<String> list1=new ArrayList<String>();    
			    list1.add("Java is a programming language");    
			    list1.add("Java is a platform");    
			        
			    ArrayList<String> list2=new ArrayList<String>();    
			    list2.add("Servlet is an Interface");    
			    list2.add("Servlet is an API");    
			        
			    Question question1=new Question();    
			    question1.setQname("What is Java?");    
			    question1.setAnswers(list1);    
			        
			    Question question2=new Question();    
			    question2.setQname("What is Servlet?");    
			    question2.setAnswers(list2);    
			        
			    session.save(question1);    
			    session.save(question2);    
			        
			    session.getTransaction().commit();        
			    System.out.println("success");    
			 }finally {
					factory.close();    
			}    
		
	}


}


package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create sessionFactory
				SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();
						
				
				//create session
				
				Session session = factory.getCurrentSession();
				
				try {
					//use the session object to save the data
					System.out.println("Creating 3 new student objects..");
					
					//create 3 student objects
					Student tempStudent1 = new Student("Paul","784","hujfu@gmail.com");
					Student tempStudent2 = new Student( "ren","aborty","drench@gmail.com");
					Student tempStudent3 = new Student("Magoo","das","ouhloayansaha@gmail.com");
					
					//start a transaction
					session.beginTransaction();
					
					//save the student object
					session.save(tempStudent1);
					session.save(tempStudent2);
					session.save(tempStudent3);
					
					//commit  transaction
					session.getTransaction().commit();
					
					System.out.println("Done!");
				}finally {
					factory.close();
				}
	}

}

package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class CreateStudentDemo {

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
			System.out.println("Creating new student object..");
			
			//create the student object
			Student tempStudent = new Student(452,"Robin","Jui","juirobin@gmail.com");
			
			//start a transaction
			session.beginTransaction();
			
			//save the student object
			session.save(tempStudent);
			
			//commit  transaction
			session.getTransaction().commit();
			
			System.out.println("DONE");
		}finally {
			factory.close();
		}

	}

}

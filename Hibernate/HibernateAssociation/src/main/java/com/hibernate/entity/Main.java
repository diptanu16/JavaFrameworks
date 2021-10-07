package com.hibernate.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		System.out.println("Hibernate One-to-One Mapping");
			SessionFactory factory = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Employee.class)
					.addAnnotatedClass(Passport.class)
					.buildSessionFactory();
			//create session
			Session session = factory.getCurrentSession();
			
		try {
			//use the session object to save the data
			System.out.println("Creating  new Passport objects..");

			//create  objects
			Passport passportDetails = new Passport("AE784","India");
			
			Employee employee = new Employee("Rahul","Debnath");
			
			employee.setPassportDetails(passportDetails);
			passportDetails.setEmployee(employee);
			
			
			//Starting transaction
			session.beginTransaction();
			//saving employee object
			session.save(employee);

			session.getTransaction().commit();
			
			System.out.println(employee.getEmployeeId());
			System.out.println(employee.getPassportDetails().getEmployeeId());
			
			session.close();
			System.out.println("Done!");
			System.out.println("-----------------------------------");
		
	}finally {
		factory.close();
	}
	
	}
}

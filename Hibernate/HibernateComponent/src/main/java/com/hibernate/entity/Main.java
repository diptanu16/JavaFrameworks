package com.hibernate.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

		public static void main(String[] args) {
			System.out.println("Hibernate Component Mapping table per hierarchy Approach");
				SessionFactory factory = new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Employee.class)
						.addAnnotatedClass(Regular.class)
						.addAnnotatedClass(Contract.class)
						.buildSessionFactory();
				//create session
				Session session = factory.getCurrentSession();
				
			try {
				//use the session object to save the data
				session.beginTransaction();
				
				Employee employee = new Employee();
				employee.setFirstname("Diptanu");
				employee.setLastname("Debnath");
				session.save(employee);
				
				Contract contract = new Contract();
				contract.setFirstname("Rakesh");
				contract.setLastname("Sarkar");
				contract.setAllowance("5200");
				session.save(contract);
				
				Regular  regular = new Regular();
				regular.setFirstname("Shayan");
				regular.setLastname("Saha");
				regular.setQplc("Starter");
				session.save(regular);
				
				session.getTransaction().commit();
				session.close();
				System.out.println("Done!");
				System.out.println("-----------------------------------");
	}finally {
		factory.close();
	}

	}

}

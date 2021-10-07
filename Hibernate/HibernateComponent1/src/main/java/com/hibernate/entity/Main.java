package com.hibernate.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hibernate Component Mapping table per SubClass Approach");
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
			employee.setFirstname("Ashely");
			employee.setLastname("Young");
			session.save(employee);
			
			Contract contract = new Contract();
			contract.setFirstname("Nandu");
			contract.setLastname("Kumar");
			contract.setAllowance("4200");
			session.save(contract);
			
			Regular  regular = new Regular();
			regular.setFirstname("Shayan");
			regular.setLastname("Saha");
			regular.setQplc("Expert");
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



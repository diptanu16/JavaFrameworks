package com.hibernate.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	
		@SuppressWarnings("unchecked")
		public static void main(String[] args) {
			System.out.println("Hibernate One-to-Many Mapping");
				SessionFactory factory = new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Employee.class)
						.addAnnotatedClass(Department.class)
						.buildSessionFactory();
				//create session
				Session session = factory.getCurrentSession();
				
			try {
				//use the session object to save the data
				session.beginTransaction();
				Department department = new Department();
				department.setDepartmentName("Sociology");
				
				session.save(department);
				
				Employee emp1 = new Employee("Shayan","Saha");
				Employee emp2 = new Employee("Lionel", "Messi");

				emp1.setDepartment(department);
				emp2.setDepartment(department);
				
				session.save(emp1);
				session.save(emp2);

				session.getTransaction().commit();
				session.close();
				System.out.println("Done!");
				System.out.println("-----------------------------------");
	}finally {
		factory.close();
	}

}
}

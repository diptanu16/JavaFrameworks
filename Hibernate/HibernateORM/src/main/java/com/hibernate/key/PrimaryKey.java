package com.hibernate.key;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Employee;


public class PrimaryKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();


		//create session

		Session session = factory.getCurrentSession();

		try {
		//use the session object to save the data
		System.out.println("Creating 5 new Employee objects..");

		//create 5 student objects
		Employee tempEmp1 = new Employee("Dip","Sde",4000);
		Employee tempEmp2 = new Employee("Rohan","Sde",5000);
		Employee tempEmp3 = new Employee("Shayan","Test",6000);
		Employee tempEmp4 = new Employee("Naveen","Bed",7000);
		Employee tempEmp5 = new Employee("Pushkar","Fed",8000);


		//start a transaction
		session.beginTransaction();

		//save the student object
		session.save(tempEmp1);
		session.save(tempEmp2);
		session.save(tempEmp3);
		session.save(tempEmp4);
		session.save(tempEmp5);

		//commit  transaction
		session.getTransaction().commit();

		System.out.println("Done!");
		}finally {
		factory.close();
		}
		}




}



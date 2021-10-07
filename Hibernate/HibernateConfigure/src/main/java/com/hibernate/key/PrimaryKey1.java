package com.hibernate.key;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import com.hibernate.entity.Employee1;




public class PrimaryKey1 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee1.class)
				.buildSessionFactory();


		//create session

		Session session = factory.getCurrentSession();

		try {
		//use the session object to save the data
		System.out.println("Creating 3 new Employee objects..");

		//create 5 student objects
		Employee1 tempEmp1 = new Employee1(1,"Rahul","B1");
		Employee1 tempEmp2 = new Employee1(2,"Rohan","B2");
		Employee1 tempEmp3 = new Employee1(3,"Shayan","B3");



		//start a transaction
		session.beginTransaction();

		//SAVING the student object
		session.save(tempEmp1);
		session.save(tempEmp2);
		session.save(tempEmp3);

		//commit  transaction
		session.getTransaction().commit();

		System.out.println("Done!");
		System.out.println("-----------------------------------");
		
		
		}finally {
		factory.close();
		}
		}




}




package com.hibernate.key;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import com.hibernate.entity.Employee1;


public class ReadKey {

	
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
		System.out.println("Reading new Employee objects..");
		
		//start a transaction
		session.beginTransaction();

		//READING the student object
		Query query1 =  session.createQuery("from Employee1 where EmpName = 'Rahul' ");
		
		List<Employee1> collection1=  query1.getResultList();
		System.out.println("Retrieving a particular object where EmpName is 'Rahul'");
		for(Employee1 employee : collection1)
		{
			System.out.println("Employee Id : " + employee.getEmpId());
			System.out.println("Employee Name : " + employee.getEmpName());
			System.out.println("Employee Band : " + employee.getEmpBand());	
			System.out.println();
		}
		
			//commit  transaction
			session.getTransaction().commit();

			System.out.println("Done!");
			System.out.println("-----------------------------------");	
		}finally {
			factory.close();
			}
		
	}
}

	
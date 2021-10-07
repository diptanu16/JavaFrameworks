package com.hibernate.key;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import com.hibernate.entity.Employee1;


public class UpdateKey {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee1.class)
				.buildSessionFactory();


		//create session

		Session session = factory.getCurrentSession();

		try {
		
		//start a transaction
		session.beginTransaction();

		//READING the student object
		Query query2 =  session.createQuery("update Employee1 set EmpName = 'Dravid' where EmpName = 'Rohan' ");	
		System.out.println("Updating the value in a property 'EmpName' from 'Rohan' to 'Dravid' ");
		query2.executeUpdate();
		session.getTransaction().commit();
		
		//start a transaction
		session = factory.openSession();
		session.beginTransaction();
		
		Query query3 =  session.createQuery("from Employee1");
		List<Employee1> collection2 = query3.getResultList();
		
		for(Employee1 employee : collection2)
		{
			System.out.println("Employee Id : " + employee.getEmpId());
			System.out.println("New Employee Name : " + employee.getEmpName());
			System.out.println("Employee Band : " + employee.getEmpBand());	
			System.out.println();
		}
		
			

			System.out.println("Done!");
			System.out.println("-----------------------------------");	
			
		}finally {
			factory.close();
			}
		
	}
}

	
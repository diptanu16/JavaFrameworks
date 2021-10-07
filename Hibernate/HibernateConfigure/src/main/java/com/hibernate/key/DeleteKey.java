package com.hibernate.key;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.entity.Employee1;

public class DeleteKey {

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

			//READING the employee object
			Query query4 =  session.createQuery("delete from Employee1 where EmpName = 'Rohan' ");	
			System.out.println("Deleting the value in a property whose name is : 'Dravid' ");
			query4.executeUpdate();
			session.getTransaction().commit();
			
			//start a transaction
			session = factory.openSession();
			session.beginTransaction();
			//Reading the employee object after deletion
			Query query5 =  session.createQuery("from Employee1");
			List<Employee1> collection5 = query5.getResultList();
			
			for(Employee1 employee : collection5)
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



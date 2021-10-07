package com.hibernate.FetchData;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Question;

public class FetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();


		//create session

		Session session = factory.getCurrentSession();
			session.beginTransaction();
			
		    TypedQuery query=session.createQuery("from Question");    
		    List<Question> list=query.getResultList();   
		        
		    Iterator<Question> itr=list.iterator();    
		    while(itr.hasNext()){    
		        Question q=itr.next();    
		        System.out.println("Question Name: "+q.getQname());    
		            
		        //printing answers    
		        List<String> list2=q.getAnswers();    
		        Iterator<String> itr2=list2.iterator();    
		        while(itr2.hasNext()){    
		            System.out.println(itr2.next());    
		        }          
		    }    
		    session.close();    
		    System.out.println("success");         
		}    
		    
	}



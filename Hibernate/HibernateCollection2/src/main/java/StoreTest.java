import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Continent;

public class StoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();


		//create session

		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			
		
		
		
		
		HashMap<String,String> map1=new HashMap<String,String>();    
		map1.put("India","New Delhi");    
		map1.put("Japan","Tokyo"); 
		
		HashMap<String,String> map2=new HashMap<String,String>();       
		map2.put("Japan","Tokyo"); 
		    

		Continent continent1=new Continent();
		continent1.setCname("India");
		continent1.setCountries(map1);;

		Continent continent2 =new Continent();
		continent2.setCname("Japan");
		continent2.setCountries(map2);
		    
		    
		session.save(continent1);
		session.save(continent2);
	    
		    
		session.getTransaction().commit(); 

		
		System.out.println("successfully stored");    
		}finally {
			session.close();
			factory.close();
		}    

	}

}

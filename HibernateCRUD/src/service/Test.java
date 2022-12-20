package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import entity.Teacher;

public class Test {
	public static void main(String[] args) {
		System.out.println("Connecting to Database");
		SessionFactory factory = null;
		Session session = null;
		factory = new Configuration()
				  .configure("hibernate.cfg.xml")
				  .buildSessionFactory();
		System.out.println("created");
			
		Teacher t1 = new Teacher("Beneli", "Paul","beneli@gl.com");
		Teacher t2 = new Teacher("Seneli", "Faul","seneli@gl.com");
		Teacher t3 = new Teacher("Geneli", "Jaul","geneli@gl.com");
		Teacher t4 = new Teacher("Peneli", "Gaul","peneli@gl.com");
		
		Transaction tx = null;
		try {
			
		session = factory.getCurrentSession();
	    tx = session.beginTransaction();
	    Teacher teacher = session.get(Teacher.class,1);		    
	    System.out.println("Teacher"+teacher);
		tx.commit();
		}
		catch(Exception e)
		{
			System.out.println("error"+e.getMessage());
		}
		finally {
			session.close();
			factory.close();
		}
	}
}

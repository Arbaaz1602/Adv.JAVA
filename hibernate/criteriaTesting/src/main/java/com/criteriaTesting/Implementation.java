package com.criteriaTesting;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Implementation {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure();
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();

		
		  Criteria cr = session.createCriteria(Student.class);
		  
		  cr.add(Restrictions.gt("marks", 80.0));
		  
		  List<Student> stdList = cr.list();
		 
		 for(int i=0; i< stdList.size();i++)
		 {
			 System.out.println(stdList.get(i));
		 }
		  
		 
		  
		 
		/*
		 * Student s1 = new Student(110,"Vipul",59.25); Student s2 = new
		 * Student(111,"Kalpesh",72.22);
		 * 
		 * Transaction tx = session.beginTransaction();
		 * 
		 * session.save(s1); session.save(s2);
		 * 
		 * tx.commit();
		 * 
		 * System.out.println("Data entered successfully");
		 */

	}

}

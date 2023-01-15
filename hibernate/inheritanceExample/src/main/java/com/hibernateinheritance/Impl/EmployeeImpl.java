package com.hibernateinheritance.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernateinheritance.Entity.Developer;
import com.hibernateinheritance.Entity.Employee;
import com.hibernateinheritance.Entity.Manager;

public class EmployeeImpl {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Employee emp = new Employee();
		emp.setName("Arbaaz");
		
		Manager man = new Manager();
		man.setName("Asif");
		man.setSalary(50000);
		man.setBonus(5000);
		
		Developer dev = new Developer();
		dev.setName("Umer");
		dev.setContPeriod(5);
		dev.setOvertimePerHour(500);
		
		Transaction tx = session.beginTransaction();
		
		session.persist(emp);
		session.persist(man);
		session.persist(dev);
		
		tx.commit();
		
		
		session.close();
		factory.close();
		
		
		

	}

}

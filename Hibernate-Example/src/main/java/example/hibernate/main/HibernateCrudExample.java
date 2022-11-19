package example.hibernate.main;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;

import example.entity.Student;

public class HibernateCrudExample {
	
	private static void create()
	{
		Configuration conf = new Configuration();//When this object is created it looks for hibernate.properties
		//in oup application we have a cgf file i.e (hibernate.cgf.xml)
		//making the database look for cgf file
		conf.configure();//looks for hibernate.cgf.xml
		System.out.println("Configuration done");
		
		//Building a session factory
		SessionFactory factory = conf.buildSessionFactory();
		System.out.println("SessionFactory created");
		
		//building the session
		Session session = factory.openSession();
		System.out.println("Session built");
		
		//Building and starting transaction
		//This is done using buildtransaction() on session object
		Transaction tx = session.beginTransaction();
		System.out.println("Transaction built");
		
		//Now we needto build a transaction object
		//Transaction object is nothing but creating an object of the class of which the properties are to be inserted into the table
		Student S = new Student(257,"Arbaaz",56);
		System.out.println("Student object built")
		;
		//Attaching this created entity using the save() method
		session.save(S);
		System.out.println("Save method is executed");
		//This makes the query to execute
		
		//Commiting the transaction
		//It is done by using commit() method of transaction
		tx.commit();
		System.out.println("Transaction commited");
		
		//Now the query is excuted
		//At the end we need to close the session and the SessionFactory
		
		session.close();
		factory.close();
		}
	
	private static void retrieve()
	{
		Configuration conf = new Configuration();//When this object is created it looks for hibernate.properties
		//in oup application we have a cgf file i.e (hibernate.cgf.xml)
		//making the database look for cgf file
		conf.configure();//looks for hibernate.cgf.xml
		System.out.println("Configuration done");
		
		//Building a session factory
		SessionFactory factory = conf.buildSessionFactory();
		
		Session session = factory.openSession();
		Class<Student> StudentType = Student.class; //Specifies which Entity Type is required
		Serializable roll = 256;//new Integer(104)
		Student foundStudent = session.load(StudentType, roll);
		//select * from restaurant_master where rest_id = 101
		System.out.println("Found Student: ");
		System.out.println(foundStudent);
		
		session.close();
		factory.close();
	}

	
	private static void update()
	{
		Configuration conf = new Configuration();//When this object is created it looks for hibernate.properties
		//in oup application we have a cgf file i.e (hibernate.cgf.xml)
		//making the database look for cgf file
		conf.configure();//looks for hibernate.cgf.xml
		System.out.println("Configuration done");
		
		//Building a session factory
		SessionFactory factory = conf.buildSessionFactory();
		
		Session session = factory.openSession();
		Class<Student> StudentType = Student.class; //Specifies which Entity Type is required
		Serializable roll = 257;//new Integer(256)
		Student foundStudent = session.load(StudentType, roll);
		System.out.println("Load called");
		Transaction tx = session.beginTransaction();
		System.out.println("Transaction started");
		//making some changes in the restraunt that hasbeen loaded
		//foundStudent.setRoll(258);
		System.out.println("before setting");
		foundStudent.setName("Arif");
		System.out.println("After setting");
		foundStudent.setScore(89);
		
		
		tx.commit();//This will make changes in the database
		System.out.println("Transaction commited");
		
		session.close();
		factory.close();
		
		
	}
	
	private static void delete()
	{
		Configuration conf = new Configuration();//When this object is created it looks for hibernate.properties
		//in oup application we have a cgf file i.e (hibernate.cgf.xml)
		//making the database look for cgf file
		conf.configure();//looks for hibernate.cgf.xml
		System.out.println("Configuration done");
		
		//Building a session factory
		SessionFactory factory = conf.buildSessionFactory();
		
		Session session = factory.openSession();
		Class<Student> StudentType = Student.class; //Specifies which Entity Type is required
		Serializable roll = 257;//new Integer(104)
		Student foundStudent = session.load(StudentType, roll);
		
		Transaction tx = session.beginTransaction();
		//deleting the entity that has been loaded
		session.delete(foundStudent);//results into dml delete
		
		tx.commit();
		
		System.out.println("Record deleted");
	}
	
	private static void retreveAgain()
	{
		Configuration conf = new Configuration();//When this object is created it looks for hibernate.properties
		//in oup application we have a cgf file i.e (hibernate.cgf.xml)
		//making the database look for cgf file
		conf.configure();//looks for hibernate.cgf.xml
		System.out.println("Configuration done");
		
		//Building a session factory
		SessionFactory factory = conf.buildSessionFactory();
		
		Session session = factory.openSession();
		Class<Student> StudentType = Student.class; //Specifies which Entity Type is required
		Serializable roll = 256;//new Integer(104)
		Student foundStudent = session.load(StudentType, roll);//
	//	Object c = foundStudent.getClass();
		//System.out.println(c);
		int rollnew = foundStudent.getRoll();
		System.out.println("Roll number is "+rollnew);
		
		
//		System.out.println("Roll: "+foundStudent.getRoll());
//		System.out.println("Roll: "+foundStudent.getRoll());
//		System.out.println("Roll: "+foundStudent.getRoll());
//		System.out.println("Roll: "+foundStudent.getRoll());
//		System.out.println("Roll: "+foundStudent.getRoll());
//		System.out.println("Roll: "+foundStudent.getRoll());

		
	System.err.println("Name: "+foundStudent.getName());
	System.out.println("After getname and before getscore");
	System.out.println("Score: "+foundStudent.getScore());
	System.out.println("After getscore");
		
		
	}
	
	private static void retrieveAllAgain()
	{
		Configuration conf = new Configuration();//When this object is created it looks for hibernate.properties
		//in oup application we have a cgf file i.e (hibernate.cgf.xml)
		//making the database look for cgf file
		conf.configure();//looks for hibernate.cgf.xml
		System.out.println("Configuration done");
		
		//Building a session factory
		SessionFactory factory = conf.buildSessionFactory();
		
		Session session = factory.openSession();
		Class<Student> StudentType = Student.class; //Specifies which Entity Type is required
		Serializable roll = 257;//new Integer(104)
		Student foundStudent = session.load(StudentType, roll);//
			Object c = foundStudent.getClass().getName();
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		//create();
		//retrieve();
		//update();
		//delete();
		//retreveAgain();
		retrieveAllAgain();
	}

}

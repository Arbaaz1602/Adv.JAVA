package example.hibernate.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import example.entity.Movie;

public class HibernateUtils {
	public static SessionFactory buildSessionFactory()
	{
		Configuration conf = new Configuration();//When this object is created it looks for hibernate.properties
		//in oup application we have a cgf file i.e (hibernate.cgf.xml)
		//making the database look for cgf file
		conf.configure();//looks for hibernate.cgf.xml
		System.out.println("Registering movie entity with configuration");
		Class movieType = Movie.class;
		conf.addAnnotatedClass(movieType);
		
		//Building a session factory
		SessionFactory factory = conf.buildSessionFactory();
		
		return factory;
		
	}

	public HibernateUtils() {
		

	}

}

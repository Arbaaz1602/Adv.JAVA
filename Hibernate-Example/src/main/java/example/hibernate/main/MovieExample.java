package example.hibernate.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import example.entity.Movie;
import example.ConstructorExpression.MovieTitleAndYear;
import example.hibernate.utility.HibernateUtils;

public class MovieExample {

	public MovieExample() {
		// TODO Auto-generated constructor stub
	}
	
	private static void create()
	{
		SessionFactory factory = HibernateUtils.buildSessionFactory();
		Session session = factory.openSession();
		Movie currentMovie = new Movie("M4","Lagaan","motivation",2000);
		
		Transaction tx = session.beginTransaction();
		System.out.println("Before exception");
		session.save(currentMovie);
		tx.commit();
		System.out.println("Movie added");
		session.close();
		factory.close();
			
	}
	
	private static void hqlUsingFromClause()
	{
		SessionFactory factory = HibernateUtils.buildSessionFactory();
		Session session = factory.openSession();
		
		//Building a query string
		String hqlQuery = "from Movie f"; //from will load all data 'f' is an alias
		
		//Obtain the referance of type query
		System.out.println("Before craete query");
		Query<Movie> qrMovie = session.createQuery(hqlQuery);
		System.out.println("After craete query");
		//Obtain the list of movie objects from this query referance
		System.out.println("Before list");
		List<Movie> allMovies= qrMovie.list();
		System.out.println("After list");
		//printing all the movies
		System.out.println("Printing all movies");
		for(Movie movie:allMovies)
			System.out.println(movie);
		
		
	}
	
	private static void hqlUsingSelectClause()
	{
		SessionFactory factory = HibernateUtils.buildSessionFactory();
		Session session = factory.openSession();
		
		//Building a query string
		String hqlQuery = "select m.title, m.year from Movie m"; //from will load all data 'f' is an alias
		
		//Obtain the referance of type query
		System.out.println("Before craete query");
		Query<Object[]> qrMovie = session.createQuery(hqlQuery);
		
		List<Object[]> movieList = qrMovie.list();
		System.out.println("Printing the title and year of all the movies:");
		
		for(Object movie[]: movieList)
			System.out.println("Title: "+movie[0]+"   Year: "+movie[1]);
		
		
		
	}
	
	
	private static void sqlUsingConstructorExpression()
	{
		SessionFactory factory = HibernateUtils.buildSessionFactory();
		Session session = factory.openSession();
		
		//Building a query string
		String hqlQuery = "select new example.ConstructorExpression.MovieTitleAndYear (m.title, m.year) from Movie m"; //from will load all data 'f' is an alias
		
		Query<MovieTitleAndYear> qr = session.createQuery(hqlQuery);
		
		List<MovieTitleAndYear> movie = qr.list();
		
		for(MovieTitleAndYear curMovie : movie)
		System.out.println(curMovie);
	
	}
	
	private static void hqlUsingCriteria()
	{
		SessionFactory factory = HibernateUtils.buildSessionFactory();
		Session session = factory.openSession();
		
		Criteria cr = session.createCriteria(Movie.class);
		
		List<Movie> allMovies = cr.list();
		
		for(Movie movie:allMovies)
			System.out.println(movie);
		session.close();
		factory.close();
		
	}
	
	private static void hqlUsingCriteriaWithRestriction()
	{
		SessionFactory factory = HibernateUtils.buildSessionFactory();
		Session session = factory.openSession();
		
		Criteria cr = session.createCriteria(Movie.class);
		//Adding some restriction to fetch those movies released between 1965-1999
		cr.add(Restrictions.between("year",1965,1999));
		List<Movie> allMovies = cr.list();
		
		for(Movie movie:allMovies)
			System.out.println(movie);
		session.close();
		factory.close();
	}

	public static void main(String[] args) {
		//hqlUsingFromClause();
		//hqlUsingSelectClause();
		//sqlUsingConstructorExpression();
		//hqlUsingCriteria();
		hqlUsingCriteriaWithRestriction();
	}
	

}

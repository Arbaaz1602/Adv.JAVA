package example.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import example.spring.core.Customer;
import example.spring.core.GreetingService;

public class SpringDemo {

	public static void main(String[] args) {
		
		
		String filepath = "./src/main/resources/spring.config.xml";//Setting the filepath
		
		//Building the application context using fileSystem environment based on filepath
		ApplicationContext  ctx = new FileSystemXmlApplicationContext(filepath);
		//This class loads the bean using the configuration file path
		
		//Obtaining the bean having id="greet"
		//System.out.println("1");
		Object obj = ctx.getBean("customer1");
		//System.out.println("2");
		//TypeCast object into greeting service
		//GreetingService gs = (GreetingService)obj;
		Customer gs = (Customer)obj;
		//invoke the method
		//String message = gs.sayGreeting();
		System.out.println(gs);
		
		

	}

}

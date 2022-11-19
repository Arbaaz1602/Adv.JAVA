package example.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import example.spring.core.Customer;
import example.spring.core.GreetingService;

public class ScopeExample {

	public static void main(String[] args) {
		
		
		String filepath = "./src/main/resources/spring.config.xml";//Setting the filepath
		
		//Building the application context using fileSystem environment based on filepath
		ApplicationContext  ctx = new FileSystemXmlApplicationContext(filepath);
		//This class loads the bean using the configuration file path
		
		//Obtaining the bean having id="greet"
		
		Object obj1 = ctx.getBean("pr");

		
		//invoking the same bean
		Object obj2 = ctx.getBean("pr");
		//invoke the method
		
		System.out.println("Equal "+(obj1==obj2));
		
		

	}

}

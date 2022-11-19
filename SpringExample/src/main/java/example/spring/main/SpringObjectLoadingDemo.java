package example.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import example.spring.core.GreetingService;

public class SpringObjectLoadingDemo {

	public static void main(String[] args) {
		
		
		String filepath = "./src/main/resources/spring.config.xml";//Setting the filepath
		
		//Building the application context using fileSystem environment based on filepath
		//ApplicationContext  ctx = new FileSystemXmlApplicationContext(filepath);
		//This class loads the bean using the configuration file path
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.config.xml");//In this line the class path is given
		ctx.getBean("greet2");
		
			
		
		

	}

}

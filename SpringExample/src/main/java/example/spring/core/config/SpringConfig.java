package example.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import example.spring.core.GreetingService;
import example.spring.core.HelloService;
import example.spring.core.WelcomService;

@Configuration // Tells spring that this class is a configuration specific class
public class SpringConfig {

	// This class will be considered as the springs configuration unit
	// Configuring a bean of type HelloService

	@Bean  //Tells spring that this method is a bean creation method so that the object returned from thismmethod will not be an ordinary object.
		   //in fact it will become a managed component	
	public GreetingService helloBean() {
		GreetingService service = new HelloService();//By default gets registered with id = helloBean
		return service;

	}

	@Bean
	public GreetingService welcomeBean()
	{
		GreetingService service = new WelcomService();
		return service;
	}
}

package example.spring.core.annotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import example.spring.core.GreetingService;
import example.spring.core.config.SpringConfig;

public class SpringDemo {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ax = new AnnotationConfigApplicationContext();

		// registering springConfig with AnnotationConfigApplicationContext

		Class<SpringConfig> configUnit = SpringConfig.class;
		ax.register(configUnit);
		// refresh method must be called for refreshing the context
		ax.refresh();

		Object gs = ax.getBean("helloBean");
		GreetingService gss = (GreetingService) gs;

		System.out.println(gss.sayGreeting());

	}

}

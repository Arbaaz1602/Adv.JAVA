package example.spring.core.annotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import example.spring.core.config.SpringConfig3;

public class SpringDemo3 {

	public static void main(String[] args) {

		Class<SpringConfig3> sp = SpringConfig3.class;
		
		ApplicationContext ax= new AnnotationConfigApplicationContext(sp);
		

	}

}

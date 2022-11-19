package example.spring.core.annotation.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import example.spring.core.config.SpringConfig2;

public class SpringDemo2 {

	public static void main(String[] args) {
		
		Class<SpringConfig2> configUnit = SpringConfig2.class;
		ApplicationContext ax = new AnnotationConfigApplicationContext(configUnit);
		//Registration and refreshment is done implicitely
		
		Object obj = ax.getBean("semiFinal teams");
		List<String> sf = (List<String>)obj;
		
		for(String team : sf)
			System.out.println(team);
		

	}

}

package example.spring.core.annotation.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import example.spring.core.config.SpringConfig4;

public class SpringDemo4 {

	public static void main(String[] args) {


		Class<SpringConfig4> conf =  SpringConfig4.class;
		
		AnnotationConfigApplicationContext an = new AnnotationConfigApplicationContext(conf);
		
		System.out.println(an.getBean("cst"));

	}

}

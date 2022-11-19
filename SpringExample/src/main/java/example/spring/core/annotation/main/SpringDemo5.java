package example.spring.core.annotation.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import componens.tests.TestImpl;
import components.mesages.Message;
import example.spring.core.config.SpringConfig5;

public class SpringDemo5 {

	public static void main(String[] args) {
		
		Class<SpringConfig5> sp = SpringConfig5.class;
		AnnotationConfigApplicationContext anot = new AnnotationConfigApplicationContext(sp);
		
		//Obtaining a bean of type message 
		Message msgObj = anot.getBean(Message.class);
		String content = msgObj.getContent();
		System.out.println(content);
		
		//Obtaining a bean of type TestImpl
		System.out.println("1");
		Object obj = anot.getBean("currentTest");
		System.out.println("2");
		TestImpl test = (TestImpl)obj;
		System.out.println(test);
		test.doTest();
		 
	}

}
//No bean named 'currentTest' available
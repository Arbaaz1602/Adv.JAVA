package example.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import example.spring.core.GreetingService;
import example.spring.core.UserService;

@Configuration
public class SpringConfig3 {

	
	//Declaring a bean of type UserService
	@Bean(name="user1")
	public GreetingService userBean1()
	{
		UserService user = new UserService();
		user.setFirstName("Arbaaz");
		user.setLastName("Sayed");
		user.setAge(25);
		return user;
	}
	
	@Bean(name="user2")
	@Lazy(true)
	public GreetingService userBean2()
	{
		UserService user = new UserService("Umer","Karbhari",22);
		return user;
	}
}

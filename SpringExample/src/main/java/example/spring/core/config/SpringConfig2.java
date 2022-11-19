package example.spring.core.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig2 {

	//Declaring a bean of type java.util.list with some id other then method name 
	
	@Bean(name = "semiFinal teams")
	public List<String> getTeams()
	{
		List<String> teams = Arrays.asList("India","New Zeland", "England", "Bangladesh");
		return teams;
		
	}
}

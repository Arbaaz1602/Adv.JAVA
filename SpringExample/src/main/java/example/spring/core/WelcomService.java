package example.spring.core;

public class WelcomService implements GreetingService {
	
	public WelcomService()
	{
		System.out.println("WelcomeService");
	}

	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Welcome from sayGreeting";
	}

}

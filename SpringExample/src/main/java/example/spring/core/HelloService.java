package example.spring.core;

public class HelloService implements GreetingService {

	public HelloService() {
		System.out.println("Hello Service Constructor (No-Arg)");
	}

	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello from Spring";
	}

}

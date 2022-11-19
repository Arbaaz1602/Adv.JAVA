package example.spring.core;

public class UserService implements GreetingService {
	
	private String firstName;
	private String lastName;
	private int age;

	public UserService(String firstName, String lastName, int age) {
		System.out.println("User service parameterized");
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public UserService() {
		System.out.println("Inside no-arg constructor");
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("Setting first name");
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println("Setting last name");
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setting age");
		this.age = age;
	}

	public String sayGreeting() {
		
		return "Hi "+firstName+" "+lastName+" Your age is: "+age;
	}

}

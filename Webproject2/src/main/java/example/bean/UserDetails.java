package example.bean;

import java.time.LocalDate;

public class UserDetails {
	
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	public UserDetails() {
		firstName="James";
		lastName="Bond";
		birthDate=LocalDate.of(1955, 12,23);
	}
	public UserDetails(String firstName, String lastName, LocalDate birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "UserDetails [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + "]";
	}
	
	

}

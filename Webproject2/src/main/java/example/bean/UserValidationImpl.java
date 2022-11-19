package example.bean;

public class UserValidationImpl {

	public static UserDetails getValidatedUser(User currentUser)
	{
		//check for the vaid key
		UserDetails foundDetails = UserRepository.getUserDetails(currentUser);
		return foundDetails;
		
	}
}

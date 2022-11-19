package example.beans;

import example.bean.User;

public class UserValidator {
	
	public static boolean isValid(User ongoingUser)
	{
		boolean valid = false;
		String uname = ongoingUser.getUserName();
		String pass = ongoingUser.getPassword();
		if(uname.equals("Shabnam") && pass.equals("shabnam1234"))
			valid=true;
		
		return valid;
	}

}

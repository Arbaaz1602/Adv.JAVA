package example.bean;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
	
	private static Map<User,UserDetails> userData;
	
	static {
		
		//Initializing the map 
		userData =  new HashMap<User, UserDetails>();
		User user1= new User("james","james123");
		User user2= new User("gavin","gavin123");
		User user3= new User("rod","rod123");
		User user4= new User("umer","umer123");
		
		UserDetails userdetail1 = new UserDetails();
		UserDetails userdetail2 = new UserDetails("gavin","king",LocalDate.of(1960,10,27));
		UserDetails userdetail3 = new UserDetails("rod","king",LocalDate.of(1955,11,20));
		UserDetails userdetail4 = new UserDetails("umer","king",LocalDate.of(1970,10,27));
		
		//putting the data in map
		userData.put(user1, userdetail1);
		userData.put(user2, userdetail2);
		userData.put(user3, userdetail3);
		userData.put(user4, userdetail4);
		
	}
	//This method retreaves user details based upon user credentials stored in user object
	//if not found (invalid) null gets returned
	public static UserDetails getUserDetails(User key) {
		
		UserDetails detailsOfUser = userData.get(key);
		return detailsOfUser;
		
	}

}

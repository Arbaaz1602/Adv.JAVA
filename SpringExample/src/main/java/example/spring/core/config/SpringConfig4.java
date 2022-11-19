package example.spring.core.config;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import example.spring.core.Contact;
import example.spring.core.Customer;
import example.spring.core.Customer2;

@Configuration
public class SpringConfig4 {
	
@Bean(name="cst")
public Customer2 getCustomer()
{
	Customer2 cust =  new Customer2();
	cust.setCustomerid("12343");
	cust.setName("Rishikesh");
	//Here values have been set for customer id and name and not for contact details
	//ContactDetails propety needs to be auto wired
	return cust;
}


@Bean(name = "cnt1")
public Contact getContact1() {
	Contact cnt = new Contact("965478545", "rishi@1234");
	return cnt;
}

@Bean(name = "cnt2")
public Contact getContact2() {
	Contact cnt = new Contact("85623495", "omkar@1234");
	return cnt;
}

}

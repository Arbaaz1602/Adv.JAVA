package example.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer2  {
	private String Customerid;
	private String name;
	
	
	@Autowired
	//Use Autowired(required=false) to make auto wiring optional
	@Qualifier("cnt2")
	private Contact contactDetails;

	public Customer2() {
		// TODO Auto-generated constructor stub
	}

	public Customer2(String customerid, String name, Contact contactDetails) {
		super();
		Customerid = customerid;
		this.name = name;
		this.contactDetails = contactDetails;
	}

	public String getCustomerid() {
		return Customerid;
	}

	public void setCustomerid(String customerid) {
		Customerid = customerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Contact getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(Contact contactDetails) {
		this.contactDetails = contactDetails;
	}

	@Override
	public String toString() {
		return "Customer [Customerid=" + Customerid + ", name=" + name + ", contactDetails=" + contactDetails + "]";
	}
	
	

}

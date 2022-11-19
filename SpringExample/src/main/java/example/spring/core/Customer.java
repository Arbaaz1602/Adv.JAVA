package example.spring.core;

public class Customer  {
	private String Customerid;
	private String name;
	private Contact contactDetails;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerid, String name, Contact contactDetails) {
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

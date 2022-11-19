package example.spring.core;

public class Contact {
	
	private String mobileNo;
	private String email;
	

	public Contact() {
		// TODO Auto-generated constructor stub
	}


	public Contact(String mobileNo, String email) {
		super();
		this.mobileNo = mobileNo;
		this.email = email;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Contact [mobileNo=" + mobileNo + ", email=" + email + "]";
	}
	
	

}

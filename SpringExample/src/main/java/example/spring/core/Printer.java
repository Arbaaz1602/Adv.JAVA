package example.spring.core;

public class Printer {
	
	private String make;
	private String type;
	

	public Printer() {
		// TODO Auto-generated constructor stub
	}


	public Printer(String make, String type) {
		super();
		this.make = make;
		this.type = type;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Printer [make=" + make + ", type=" + type + "]";
	}
	
	

}

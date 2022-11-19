package example.entity;

public class Student {
	
	private int roll;
	private String name;
	private int score;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student(int roll, String name, int score) {
		super();
		this.roll = roll;
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", score=" + score + "]";
	}
	

}

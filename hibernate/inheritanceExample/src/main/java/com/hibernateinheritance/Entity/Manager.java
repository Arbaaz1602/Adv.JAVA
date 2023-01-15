package com.hibernateinheritance.Entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Manager")
@PrimaryKeyJoinColumn(name = "ID")
public class Manager extends Employee {
	
	
	private int salary;
	private int bonus;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(int empid, String name) {
		super(empid, name);
		// TODO Auto-generated constructor stub
	}
	public Manager(int empid, String name, int salary, int bonus) {
		super(empid, name);
		this.salary = salary;
		this.bonus = bonus;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "Manager [salary=" + salary + ", bonus=" + bonus + "]";
	}
	
	
	

}

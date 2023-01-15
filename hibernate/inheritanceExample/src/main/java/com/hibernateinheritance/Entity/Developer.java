package com.hibernateinheritance.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "developer")
@PrimaryKeyJoinColumn(name = "ID")
public class Developer extends Employee {
	
	@Column(name = "contract")
	private int contPeriod;
	@Column(name = "otpay")
	private int overtimePerHour;
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Developer(int empid, String name) {
		super(empid, name);
		// TODO Auto-generated constructor stub
	}
	public Developer(int empid, String name, int contPeriod, int overtimePerHour) {
		super(empid, name);
		this.contPeriod = contPeriod;
		this.overtimePerHour = overtimePerHour;
	}
	public int getContPeriod() {
		return contPeriod;
	}
	public void setContPeriod(int contPeriod) {
		this.contPeriod = contPeriod;
	}
	public int getOvertimePerHour() {
		return overtimePerHour;
	}
	public void setOvertimePerHour(int overtimePerHour) {
		this.overtimePerHour = overtimePerHour;
	}
	@Override
	public String toString() {
		return "Developer [contPeriod=" + contPeriod + ", overtimePerHour=" + overtimePerHour + "]";
	}
	
	

}

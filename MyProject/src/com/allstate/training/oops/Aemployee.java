package com.allstate.training.oops;

public class Aemployee {
	private int empno;
	private String name;
	private double salary;
	private String address;
	private Department deapartment=new Department(12,"Production");
	public Aemployee(int empno,String name, double salary,String address) {
		this.empno=empno;
		this.name=name;
		this.salary=salary;
		this.address=address;
	}
	@Override
	public String toString() {
		return "Aemployee [empno=" + empno + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ ", deapartment=" + deapartment + "]";
	}
	
 
}

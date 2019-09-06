package com.allstate.training.oops;

public class Department {
	private int deptid;
    private String dname;
	public Department(int deptid,String dname) {
		this.deptid = deptid;
		this.dname=dname;
	}
	public String toString()
	{
		return deptid+" "+dname;
	}
}

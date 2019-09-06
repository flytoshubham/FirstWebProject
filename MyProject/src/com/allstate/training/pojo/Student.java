package com.allstate.training.pojo;

import java.io.Serializable;

public class Student implements Serializable{
String stid,stname,phno,dob;
public Student(String stid,String stname)
{
	this.stid=stid;
	this.stname=stname;

}
public String getName() {
	return stname;
}
@Override
public String toString() {
	return "Student [stid=" + stid + ", stname=" + stname + ", phno=" + phno + ", dob=" + dob + "]";
}

}

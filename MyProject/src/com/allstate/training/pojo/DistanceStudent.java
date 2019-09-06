package com.allstate.training.pojo;

public class DistanceStudent extends Student{
Course course;

public DistanceStudent(String stid, String stname, String phno, String dob) {
	super(stid, stname, phno, dob);
}


public DistanceStudent(String stid, String stname, String phno, String dob, Course course) {
	super(stid, stname, phno, dob);
	this.course = course;
}


@Override
public String toString() {
	return "DistanceStudent [course=" + course + "]";
}
 

}

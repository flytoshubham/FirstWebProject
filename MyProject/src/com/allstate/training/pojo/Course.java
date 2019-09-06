package com.allstate.training.pojo;

import java.io.Serializable;

public class Course implements Serializable {
private String courseid;
private String coursename;
Trainer trainer=new Trainer();
public void getCourseID(String courseid)
{
	this.courseid=courseid;
}
public void getCourseName(String coursename)
{
	
	this.coursename=coursename;
}
@Override
public String toString() {
	return "Course [courseid=" + courseid + ", coursename=" + coursename + ", trainer=" + trainer + "]";
}
}

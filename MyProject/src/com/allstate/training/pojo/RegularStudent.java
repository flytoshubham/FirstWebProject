package com.allstate.training.pojo;

import java.io.Serializable;

public class RegularStudent extends Student implements Serializable{
	private double score;
	Course course;
	public RegularStudent(String stid, String stname, String phno, String dob, double score) {
		super(stid, stname, phno, dob);
		this.score = score;	
	}
	
	public RegularStudent(String stid, String stname, String phno, String dob, double score, Course course) {
		super(stid, stname, phno, dob);
		this.score = score;
		this.course = course;
	}

	@Override
	public String toString() {
		return "RegularStudent [score=" + score + ", course=" + course + "]";
	}
	

}

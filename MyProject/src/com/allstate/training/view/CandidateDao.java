package com.allstate.training.view;

import java.util.List;
import java.util.ArrayList;

public class CandidateDao {
	public List<Candidate> candidate=new ArrayList<>();
	  
 public List<Candidate> getAll()
 { candidate.removeAll(candidate);
	 candidate.add(new Candidate("Rohit","java","pune",4));
	 candidate.add(new Candidate("shubham","c++","pune",0));
	 candidate.add(new Candidate("divya","java","bangalore",0));
	 candidate.add(new Candidate("Rohit","java","pune",4));
	 candidate.add(new Candidate("Rishabh","java","bangalore",1));
	 candidate.add(new Candidate("Rohit","java","pune",2));
	 return candidate;
 }
 

	  

}

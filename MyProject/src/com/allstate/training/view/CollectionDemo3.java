package com.allstate.training.view;
import java.util.stream.Collectors;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionDemo3 {
 public static void main(String args[]){
	 CandidateDao cd=new CandidateDao();
	 List<Candidate>can=cd.getAll();
	 
	 List<Candidate>puneCandidates=cd.getAll().stream()
    .filter((cam)->cam.getCity().equals("pune")).collect(Collectors.toList());
	 for(Candidate c:puneCandidates)
	 System.out.println(c);
}
}

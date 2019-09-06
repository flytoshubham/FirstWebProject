package com.allstate.training.oops;

public class Person
{
 long aadhar;
private String name;
 String address;
 long [] ph_no;
 public Person()
 {
	
 }
 Person(long aadhar, String name, long[]ph_no )
 {
	 this.aadhar=aadhar;
	 this.name=name;
	 this.ph_no=ph_no;
 }
 public void setname(String name1)
 {
	 name=name1;
 }
 public String getname()
 {
	 return name;
 }
 
 void display()
 {
	 System.out.println("Person Details");
	 System.out.println(aadhar+"\t"+name+ "\t");
	 for(int i=0;i<ph_no.length;i++)
	 {
		 System.out.println(ph_no[i]);
	 }
 }

public static void main(String args[])
{
	long[] phone= { 123543,15234514};
	Person person=new Person(12543543,"Ramesh",phone);
	person.display();
}}

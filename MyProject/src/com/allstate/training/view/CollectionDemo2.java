package com.allstate.training.view;
import java.util.Scanner;


public class CollectionDemo2 {
	public static void main(String args[])
	{   
		Scanner sc=new Scanner(System.in);
		DepartmentDao d=new DepartmentDao();
		do
		{
		System.out.println("1. add department");
		System.out.println("2. remove deaprtmet");
		System.out.println("3. exit");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			
			System.out.println("enter department name");
			String dname=sc.next();
			System.out.println("enter department id");
			int did=sc.nextInt();
			Department d1 =new Department(dname,did);
			d.addDepartment(d1);
			break;
		case 2:
			System.out.println("enter department index");
			int c=sc.nextInt();
			d.removeDepartment(c);
			break;
		case 3:
		       for(Department d2:d.departments)
		    	   System.out.println(d2);
		       System.exit(0);
		       break;
		 default:
			 System.out.println("invalid option");
			 break;
		}
	   }
		while(true);
	}
	

}

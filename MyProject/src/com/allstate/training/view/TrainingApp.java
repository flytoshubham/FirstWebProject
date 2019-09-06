package com.allstate.training.view;
import java.io.*;
import com.allstate.training.pojo.*;
import java.util.Scanner;
public class TrainingApp {
	public static void main (String args[])throws IOException,ClassNotFoundException
	{Scanner sc=new Scanner(System.in);
	Trainer t=new Trainer();
	Course c=new Course();
	FileOutputStream fos=new FileOutputStream("training.txt",true);
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	FileInputStream fis=new FileInputStream("training.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	do
	{
	System.out.println("Welcome to training App "+"1.Create trainer\n "+"2.Create Course\n"+"3.Create Student"+"4.Exit");
	int choice=sc.nextInt();
	
	switch(choice)
	{
	case 1:
		System.out.println("Enter trainerid");
		String tid=sc.next();
		
		t.setTrainerid(tid);
		System.out.println("Enter trainername");
		String n=sc.next();
		t.setTrainername(n);
		break;
	case 2:	
		System.out.println("Enter Course ID and Course name");
		c.getCourseID(sc.next());
		c.getCourseName(sc.next());
		break;
	case 3:
	        System.out.println(" Enter stid, stname,phno,dob");
	        String sid=sc.next();
	        String sname=sc.next();
	        String pno=sc.next();
	        String date=sc.next();
	        
	       System.out.println("1. Regular Student  2. Distance Student");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the score");
				double sco=sc.nextDouble();
				RegularStudent rs=new RegularStudent(sid,sname,pno,date,sco,c);
				System.out.println(rs);
			/*	FileOutputStream fos1=new FileOutputStream("training.txt",true);
				ObjectOutputStream oos1 = new ObjectOutputStream(fos);
				oos1.writeObject(rs);
				oos1.close();
				fos1.close();*/
				//oos.writeObject(rs);
				String s2=rs.toString();
				fos.write(s2.getBytes());
				break;
			case 2:
				DistanceStudent ds=new DistanceStudent(sc.next(),sname,pno,date,c);
				System.out.println(ds);
				String s1=ds.toString();
				//oos.writeObject(ds);
				fos.write(s1.getBytes());
				//DistanceStudent ds1=(DistanceStudent)ois.readObject();
				
				break;
			default:
				System.out.println("Invalid");
				break;
			}
			break;
	case 4:System.exit(0);
	       break;
	       
	default:System.out.println("Invalid");  
	         break;
               
	}		
	}
	while(true);
	}

}

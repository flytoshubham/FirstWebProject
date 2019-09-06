package com.allstate.training.BO;
import com.allstate.training.pojo.*;
import java.io.*;

public class Business {
	public void addCourse(Course c) throws IOException,ClassNotFoundException
	{
		FileOutputStream fos=new FileOutputStream(" course.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c);
	}
	public void addTrainer(Trainer t) throws IOException,ClassNotFoundException
	{
		FileOutputStream fos=new FileOutputStream(" course.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(t);
	}
	public void addStudent(Student s) throws IOException,ClassNotFoundException
	{
		FileOutputStream fos=new FileOutputStream(" course.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
	}


}

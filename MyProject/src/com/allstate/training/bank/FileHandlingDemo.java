package com.allstate.training.bank;
import java.io.*;
import java.util.*;

import java.io.FileOutputStream;

public class FileHandlingDemo {
	public static void main(String args[])
	{ System.out.println("ENter");
		Scanner sc=new Scanner(System.in);
	
		String s1=sc.next();
		try
		{
			FileOutputStream fos = new FileOutputStream("allstates.txt");
			FileInputStream fis=new FileInputStream("allstates.txt");
			fos.write(34);
			fos.write(s1.getBytes());
			int i;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
				
			}
			
			//fos.close();
	    }
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
	
	}

}

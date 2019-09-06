package com.allstate.training.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {
public static void main(String[] args) {
	Connection con=null;
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/allstates","root","admin");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Scanner sc=new Scanner(System.in);
	
	while(true)
	{System.out.println("1. signup  2.signin");
	int ch=sc.nextInt();
	
	switch(ch)
	{
	case 1:
		System.out.println("enter id");
		String id=sc.next();
		System.out.println("enter pass");
		String pass=sc.next();
		PreparedStatement pst;
		try {
			pst = con.prepareStatement("insert into login values(?,?)");
			pst.setString(1, id);
			pst.setString(2, pass);
			int i=pst.executeUpdate();
			if(i>0)
				System.out.println("signed up successfully");
			pst.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		break;
	case 2:
		System.out.println("enter id");
		String id1=sc.next();
		System.out.println("enter pass");
		String pass1=sc.next();
		PreparedStatement pst1;
		try {
			pst1 = con.prepareStatement("select * from login where id=? and pass=?");
			pst1.setString(1, id1);
			pst1.setString(2, pass1);
			ResultSet rs=pst1.executeQuery();
			if(rs.next())
				System.out.println("correct");
			else
				System.out.println("incorrect id or pass");
			pst1.close();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Incorrect id or pass");
			e1.printStackTrace();
		}
		break;
	case 3:
		System.exit(0);
		break;
	default:
		System.out.println("invalid option");
		break;
		
		
		
	}
	}
	
}
}

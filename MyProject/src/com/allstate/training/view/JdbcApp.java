package com.allstate.training.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/allstates", "root", "admin");
			System.out.println("connected");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from product");
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.print(rs.getInt(3)+" ");
				System.out.println(rs.getInt(4));
				
			}
			rs.close();
			
			
			PreparedStatement pst=con.prepareStatement("insert into product values('5','jeans','340','45')");
			//System.out.println("enter the name of the new product");
			//pst.setString(0,sc.next());
			int i=pst.executeUpdate();
			if(i>0)
				System.out.println("successful");
			ResultSet rs1=st.executeQuery("select * from product");
			while(rs1.next())
			{
				System.out.print(rs1.getInt(1)+" ");
				System.out.print(rs1.getString(2)+" ");
				System.out.print(rs1.getInt(3)+" ");
				System.out.println(rs1.getInt(4));
				
			}
			rs1.close();
			st.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}


}

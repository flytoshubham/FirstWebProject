package com.allstate.training.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbutil {
	//Class.forName("com.mysql.jdbc.Driver");
	static Connection con=null;
	public static Connection getConnection()
	{try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/allstates", "root", "admin");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
	}

}

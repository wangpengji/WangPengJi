package com.servlet;

import java.sql.DriverManager;
import java.sql.SQLException;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class ZhuCeClass {
	public static void lianjie(String user,String pwd ){
		
		 Connection con=null;
		    try{
		    	Class.forName("com.mysql.jdbc.Driver");
		    	con=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/userdb","root","admin");
		    	Statement sta=(Statement) con.createStatement();
		    	int n=sta.executeUpdate("insert user values('"+user+ "','"+pwd+"');");
		    	if(n>0){
		    	
		    	}
		    	
		    }catch(ClassNotFoundException e){
	    		e.printStackTrace();
	    		System.out.println("no");
	    	}
	    	catch (SQLException sqle){
	    		System.out.println("nonono");
	    	}
		
	}
}

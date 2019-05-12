package com.servlet;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class DengLuClass {
	public boolean lianjie(String user,String pwd ){
	 Connection con=null;
	    try{
	    	Class.forName("com.mysql.jdbc.Driver");
	    	System.out.println("加载成功");
	    	con=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/userdb","root","admin");
	    	System.out.println("连接成功");
	    	Statement sta=(Statement) con.createStatement();
	    	ResultSet n=(ResultSet) sta.executeQuery("Select * from userdb.user where user ='"+user+ "'and password='"+pwd+"';");
	    	if(n.next()){
	    		if(user.equals(user) && pwd.equals(pwd)){
	    			
	    		}
	    	}else{
	    		return false;
	    	}
	    }
	    	catch(ClassNotFoundException e){
	    		e.printStackTrace();
	    		System.out.println("no");
	    	}
	    	catch (SQLException sqle){
	    		System.out.println("报错");
	    	}
	    return true;
	  
}
}

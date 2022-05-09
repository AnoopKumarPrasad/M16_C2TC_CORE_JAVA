package com.indiabix.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example1 {

	public static void main(String[] args) throws SQLException {
		//1. download mysql j connector download for java
		String dbDriver="com.mysql.cj.jdbc.Driver";
		String dbURL="jdbc:mysql://127.0.0.1:3306/CG1";
	//2. jdbc:mqsql://localhost:port/DatabaseName
		String username="root";
		String password="anoop12816";
		//3. username | password | query
		String query="Select * FROM Employee12";
		try
		{
			Class.forName(dbDriver);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			Connection con=DriverManager.getConnection(dbURL, username, password);
			Statement st=con.createStatement();
			ResultSet r=st.executeQuery(query);
			while(r.next())
			{
				String EmployeesData="";
				for(int i=1;i<=3; i++)
				{
					EmployeesData=EmployeesData+" "+r.getString(i);
					
				}
				System.out.println(EmployeesData);	
			}
		}
		catch(SQLException e)
		{
			System.out.println("Invalid Username and Password");
			e.printStackTrace();
		}
	}
	}

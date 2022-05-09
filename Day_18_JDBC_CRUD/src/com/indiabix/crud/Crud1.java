package com.indiabix.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Crud1 {

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
			Connection con=DriverManager.getConnection(dbURL, username, password);
			
			String sql="INSERT INTO Employee23(user_name,password,email)values(?,?,?)"; //no. of columns = no. of question mark
			//String sql="SELECT * FROM Employee22"
			//question mark is used here as we are not including any value
			PreparedStatement s=con.prepareStatement(sql);
			s.setString(1, "Hrithik_j12");
			s.setString(2, "Pass@123");
			s.setString(3, "Hrithik@gmail.com");
			
			int rows=s.executeUpdate();
		
			if(rows>0)
			{
				System.out.println("A new User information entered successfully");
			}
			con.close();
		}
		catch(SQLException e)
		{
			System.out.println("Exception occurred "+e);
		}

}
}
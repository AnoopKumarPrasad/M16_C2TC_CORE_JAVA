package com.indiabix.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Crud123 {

	public static void main(String[] args) {
			String dbDriver="com.mysql.cj.jdbc.Driver";
			String dbURL="jdbc:mysql://127.0.0.1:3306/CG1";
			String username="root";
			String password="anoop12816"; //confidential
		
			try
			{
				Connection con=DriverManager.getConnection(dbURL, username, password);
				String sql="Select * From Employee22"
				Statment st=con.createStatement();
				ResultSet r=st.executeQuery(sql);
				int count=1;
				while(r.next())
				{
					String name=r.getString(1);
					String password1=r.getString(2);
					String email=r.getString(3);
					String result="USER: %d %s %s %s";
					System.out.println()
				}
				/*String sql="INSERT INTO Employee22(user_name,password,email)values(?,?,?)";
				PreparedStatement s=con.prepareStatement(sql);
				s.setString(1, "Anoop_Kumar");
				s.setString(2, "12345");
				s.setString(3, "anoopkumar@gmail.com");
				int rows=s.executeUpdate();
				
				if(rows>0)
				{
					System.out.println("A new user information added successfully");
				}*/
				con.close();
			}
			catch(SQLException e)
			{
				System.out.println("Exception Occured"+e);
			}
			

}

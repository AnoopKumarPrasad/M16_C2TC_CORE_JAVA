package com.indiabix.crud;

public class Deletecrud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
try
		{
			Connection con=DriverManager.getConnection(dbURL, username, password);
			String sql="DELETE FROM Employee22 WHERE user_id=2";
			PreparedStatement s=con.prepareStatement(sql);
			int rows=s.executeUpdate();
			
			if(rows>0)
			{
				System.out.println("A new User information deleted successfully");
			}
			con.close();
			
		}
	}

}

package com.indiabix.crud;

public class Crud2 {

			public static void main(String[] args) {
				String dbURL="jdbc:mysql://127.0.0.1:3306/CG1";
				String username="root";
				String password="anoop12816";
				try
				{
					Connection con=DriverManager.getConnection(dbURL, username, password);
					String sql="SELECT * FROM Employee22";
					Statement st=con.createStatement();
					ResultSet r=st.executeQuery(sql);
					int count=1;
					while(r.next())
					{
						
						String name=r.getString(1);
						String password1=r.getString(2);
						
		String email1=r.getString(4);
						String result =" USER: %d %s %s %s";
						System.out.println(String.format(result,count++,name,password1,email1));
					}
					con.close();
				}	
	}

}

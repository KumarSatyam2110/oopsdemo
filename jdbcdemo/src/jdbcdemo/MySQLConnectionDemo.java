package jdbcdemo;

import java.sql.*;;
public class MySQLConnectionDemo {

	public static void main(String[] args) {
		
		Connection con;
		Statement stmt;
		ResultSet rs;
		
		try {
			//load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Create a connection using getConnection(0 of DM class
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","satyam");
			
			//create statement object
			stmt=con.createStatement();
			
			//execute a query
			rs=stmt.executeQuery("select * from employees");
			
			//Traverse result set
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+ " "+ rs.getString(3)+" "+ 
			rs.getString("email")+" "+ rs.getString(8));
			}
			
			
			/*System.out.println("Display specific record  from a db");
			rs.absolute(3);
			System.out.println(rs.getInt(1)+ " "+ rs.getString(3)+" "+ rs.getString("email")+" "+ rs.getString(8));
		}*/
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}

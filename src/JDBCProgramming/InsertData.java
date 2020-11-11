package JDBCProgramming;

import java.io.*;
import java.sql.*;

public class InsertData {
public static void main(String[] args) throws SQLException {
		
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","password");
			Statement st = con.createStatement();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
				System.out.println("Enter Employee Number:");
				int eno = Integer.parseInt(br.readLine());
				System.out.println("Enter Employee Name:");
				String name = br.readLine();
				System.out.println("Enter Employee Salary:");
				float sal = Float.parseFloat(br.readLine());
				
				st.executeUpdate("insert into employee values("+eno+",'"+name+"',"+sal+")");
				System.out.println("Do you wish to continue? (Y/N)");
				String op = br.readLine();
				if(op.equals("N"))
				{
					break;
				}
	
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			con.close();
		}
		
		
	}

}

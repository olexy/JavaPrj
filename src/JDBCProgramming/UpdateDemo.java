package JDBCProgramming;

import java.io.*;
import java.sql.*;

public class UpdateDemo 
{
	public static void main(String[] args) throws ClassNotFoundException, 
												  SQLException, NumberFormatException,
												  IOException 
	{
		//Register Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Create Connection
		Connection con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","system","password");
		//create the statement
		Statement stmt = con.createStatement();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter employee number: ");
		int num = Integer.parseInt(br.readLine());
		System.out.println("Enter salary to update: ");
		int sal = Integer.parseInt(br.readLine());
		int rows = stmt.executeUpdate("update employee set esal = "+sal+" where eno="+num);
//		System.out.println("Enter name to update: ");
//		String name = br.readLine();
//		int rows = stmt.executeUpdate("update employee set esal = "+sal+", ename = "+name+" where eno="+num);
		System.out.println(rows+ " updated");
		con.close();
	}

}

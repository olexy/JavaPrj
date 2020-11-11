package JDBCProgramming;

import java.sql.*;
import java.io.*;

public class PrepStatUpdate {
	public static void main(String[] args) throws ClassNotFoundException, 
													SQLException, 
													NumberFormatException, 
													IOException {
		//Register Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Create Connection
		Connection con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","system","password");
//		String sqlst = "update employee set esal = esal + (esal * 0.5) where eno=?";
//		PreparedStatement pst = con.prepareStatement(sqlst);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter employee number: ");
//		int empno = Integer.parseInt(br.readLine());
//		pst.setInt(1, empno);
//		System.out.println(pst.executeUpdate()+" rows updated!");
		
		String sqlst = "update employee set ename = 'Martins Run' where eno=?";
		PreparedStatement pst = con.prepareStatement(sqlst);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter employee number: ");
		int empno = Integer.parseInt(br.readLine());
		pst.setInt(1, empno);
		System.out.println(pst.executeUpdate()+" rows updated!");
		con.close();
		
	}

}

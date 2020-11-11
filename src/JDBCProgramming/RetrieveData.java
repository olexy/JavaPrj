package JDBCProgramming;

import java.sql.*;

public class RetrieveData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Register Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Create Connection
		Connection con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","system","password");
		//create the statement
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from employee");
		System.out.println("Eno\tEname\tEsal");
//		System.out.println("Without Iteration");
//		rs.next();
//		System.out.println((rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)));
//		rs.next();
//		System.out.println((rs.getInt("eno")+"\t"+rs.getString("ename")+"\t"+rs.getInt("esal")));
		// System.out.println("With Iteration");
		while(rs.next())
		{
			System.out.println((rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)));
		}
		
		System.out.println("***Using Boolean***");
		boolean b = stmt.execute("select * from employee");
		ResultSet rs1 = stmt.executeQuery("select * from employee");
		System.out.println("Eno\tEname\tEsal");
		while(rs1.next())
		{
			System.out.println((rs1.getInt("eno")+"\t"+rs1.getString("ename")+"\t"+rs1.getInt("esal")));
		}
	
		con.close();
	}
	

}

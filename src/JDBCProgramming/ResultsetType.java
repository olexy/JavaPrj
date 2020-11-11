package JDBCProgramming;

import java.sql.*;

public class ResultsetType {
	public static void main(String[] args) throws ClassNotFoundException, 
													SQLException 
	{
		//Register Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Create Connection
		Connection con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","system","password");
		//create the statement
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery("select * from employee");
		System.out.println("** Begining To End **");
		System.out.println("Eno\tEname\tEsal");
		while(rs.next())
		{
			System.out.println((rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)));
		}
		System.out.println("** End to Begining **");
		System.out.println("Eno\tEname\tEsal");
		while(rs.previous())
		{
			System.out.println((rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)));
		}
	}

}

package JDBCProgramming;

import java.sql.*;

public class UpdatableRS {
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
		System.out.println(rs.isBeforeFirst());
		rs.afterLast();
		System.out.println(rs.isAfterLast());
		rs.absolute(6);
		rs.updateString(2, "Jabitha");
		rs.updateRow();
		System.out.println((rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)));
		rs.relative(-1);
		System.out.println((rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)));
		
	}

}

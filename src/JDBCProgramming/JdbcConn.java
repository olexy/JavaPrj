package JDBCProgramming;

import java.sql.*;

public class JdbcConn {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Register Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Create Connection
		Connection con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","system","password");
		//create the statement
		Statement stmt = con.createStatement();
		//Executing the query
		stmt.execute("create table two (col2 varchar2(25))");
		System.out.println("Query excuted");
		//close the connection
		con.close();
		

	}

}

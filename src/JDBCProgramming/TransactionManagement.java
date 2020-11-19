package JDBCProgramming;

import java.sql.*;

public class TransactionManagement {

	public static void main(String[] args) throws ClassNotFoundException, 
													SQLException 
	{
		//Register Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Create Connection
		Connection con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","system","password");		
		System.out.println(con.getAutoCommit());
		con.setAutoCommit(false);
		System.out.println(con.getAutoCommit());
		//create the statement
		Statement stmt = con.createStatement();
		stmt.executeUpdate("insert into Students values(10,'Peter','Moore','05-Jul-81','7649, Rijkard Lane','Houston')");
		stmt.executeUpdate("insert into Students values(11,'Donald','Trump','19-Mar-47','456 Pensylvania Avenue','Washington DC')");
		Savepoint sv = con.setSavepoint();
		stmt.executeUpdate("insert into Students values(12,'Ibrahim','Mantu','28-Nov-89','Lane 6, Atkinson Ave','Los Angeles')");
		stmt.executeUpdate("insert into Students values(13,'Tokunbo','Aberuagba','11-Jan-98','15, Ughali Street','Lagos')");
		con.commit();
		//System.out.println("Transaction Successful!");
		
		con.rollback();
		System.out.println("Transaction rollback!");
		
		//con.releaseSavepoint(sv);
		con.close();
	}

}


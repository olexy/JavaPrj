package JDBCProgramming;
import java.sql.*;
import java.io.*;

public class BatchUpdate 
{

	public static void main(String[] args) throws ClassNotFoundException, 
										SQLException, NumberFormatException,
									    IOException  
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:xe","system","password");
		Statement stmt = con.createStatement();
		stmt.addBatch("insert into Students values(4,'Peter','Strokz','27-Sep-1987','Apt 204, Rijkard Island','Porto')");
		stmt.addBatch("insert into Students values(5,'Steve','Balmer','12-Jul-1967','134, Metro Street','Philadephia')");
		stmt.addBatch("update employee set esal = 45000 where esal<30000");
		stmt.addBatch("delete from employee where eno=1245");
		
		int rc[] = stmt.executeBatch();
		
		for(int r:rc)
		{
	
			System.out.println(r+" rows Updated");
		}
		stmt.close();
		con.close();
	}

}

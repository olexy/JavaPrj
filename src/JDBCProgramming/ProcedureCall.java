package JDBCProgramming;

import java.io.*;
import java.sql.*;
import java.util.*;

public class ProcedureCall {

	public static void main(String[] args) throws ClassNotFoundException, 
													SQLException, IOException 
	{
		//Register Driver
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//Create Connection
		//Connection con = DriverManager.getConnection
		//("jdbc:oracle:thin:@localhost:1521:xe","system","password");
		
		FileInputStream fis = new FileInputStream("db.properties");
		Properties p = new Properties();
		p.load(fis);
		String driver_class = p.getProperty("driver_class");
		String driver_url = p.getProperty("driver_url");
		Class.forName(driver_class);
		Connection con = DriverManager.getConnection(driver_url,p);
		CallableStatement cst = con.prepareCall("{call getsal(?,?)}");
		cst.setInt(1, 34578);
		cst.registerOutParameter(2, Types.FLOAT);
		cst.execute();
		float salary = cst.getFloat(2);
		System.out.println("Salary retrieved is:"+salary);
	}

}

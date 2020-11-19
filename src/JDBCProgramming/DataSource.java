package JDBCProgramming;

import java.io.*;
import java.sql.*;
import java.util.*;
import javax.sql.*;

import oracle.jdbc.pool.*;

public class DataSource {

	public static void main(String[] args) throws SQLException, IOException {
		OracleConnectionPoolDataSource ds = new OracleConnectionPoolDataSource();
		FileInputStream fis = new FileInputStream("db.properties");
		Properties p = new Properties();
		p.load(fis);
		String driver_url = p.getProperty("driver_url");
		String username = p.getProperty("user");
		String password = p.getProperty("password");
		
		//Class.forName(driver_class);
		ds.setURL(driver_url);
		ds.setUser(username);
		ds.setPassword(password);
		
		PooledConnection pc = ds.getPooledConnection();
		Connection con = pc.getConnection();
		
		Statement stmt = con.createStatement();
		System.out.println("Eno\tEname\tEsal");
		System.out.println("====================");
		ResultSet rs = stmt.executeQuery("select * from employee");
		
		while(rs.next())
		{
			System.out.println((rs.getInt("eno")+"\t"+rs.getString("ename")+"\t"+rs.getInt("esal")));
		}
	
		con.close();

	}

}

package JDBCProgramming;

import java.io.*;
import java.sql.*;

public class TabCreation {
	public static void main(String[] args) throws SQLException {
		
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","password");
			Statement st = con.createStatement();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter table name");
			String tname = br.readLine();
			
			String query = "create table "+tname+"(eno number,ename varchar2(20),esal number)";
			boolean crt = st.execute(query);
			System.out.println("table creation flag is "+crt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			con.close();
		}
		
		
	}

}

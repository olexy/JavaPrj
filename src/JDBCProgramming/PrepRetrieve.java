package JDBCProgramming;

import java.io.*;
import java.sql.*;

public class PrepRetrieve {

	public static void main(String[] args) throws ClassNotFoundException, 
													SQLException, 
													NumberFormatException, 
													IOException 
	{
		//Register Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Create Connection
		Connection con = DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521:xe","system","password");
		String sqlqu = "select * from employee where esal<?";
	    PreparedStatement pst = con.prepareStatement(sqlqu);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Salary to filter ");
        int empsal = Integer.parseInt(br.readLine());
        pst.setInt(1,empsal);
        ResultSet rs = pst.executeQuery(); 
        System.out.println("Eno\tEname\tEsal");
        
	        while(rs.next())
			{
				 System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
			}
	    con.close();

	}

}

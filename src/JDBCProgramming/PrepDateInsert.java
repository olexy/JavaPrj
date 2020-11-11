package JDBCProgramming;

import java.sql.*;

public class PrepDateInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Register Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Create Connection
		Connection con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","system","password");
		String sqlst = "insert into Students values(?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sqlst);
		
		pst.setInt(1, 3);
		pst.setString(2, "Jamie");
		pst.setString(3, "Rothenburg");
		Date d = Date.valueOf("1979-04-26"); //yyyy-mm-dd
		pst.setDate(4, d);
		pst.setString(5, "2376 Ribout Road");
		pst.setString(6, "New York");
		
		int r = pst.executeUpdate();
		System.out.println(r+" Inserted Successfully");
		
		String sqlst1 = "select * from Students";
		PreparedStatement pst1 = con.prepareStatement(sqlst1);
		
		ResultSet rs1 = pst1.executeQuery();
		System.out.println("StudentID\tLastName\tFirstName\tDOB\tAddress\tCity");
		while(rs1.next())
		{
			System.out.println((rs1.getInt(1)+"\t"+rs1.getString(2)+"\t"+rs1.getString(3)+"\t"+rs1.getDate(4)+"\t"+rs1.getString(5)+"\t"+rs1.getString(6)));
		}

	}

}

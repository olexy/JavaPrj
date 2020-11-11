package JDBCProgramming;

import java.sql.*;

public class PrepStmtInterface {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Register Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Create Connection
		Connection con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","system","password");
		String sqlst = "insert into employee values(?,?,?)";
		PreparedStatement pst = con.prepareStatement(sqlst);
		
		pst.setInt(1, 563753);
		pst.setString(2, "Ronnie Jackson");
		pst.setFloat(3, 41275);
		
		int r = pst.executeUpdate();
		System.out.println(r+" Inserted Successfully");
	}

}

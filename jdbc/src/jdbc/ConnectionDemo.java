package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";

		Connection conn = null;
		try {
			Class.forName(driver);
		
			conn = DriverManager.getConnection(url, "trainee", "oracle");
			System.out.println("Connection Succesful");

			DatabaseMetaData meta = conn.getMetaData();
			System.out.println("DB name:" + meta.getDatabaseProductName());
			System.out.println("DB Version:" + meta.getDatabaseProductVersion());
			System.out.println("Driver name:" + meta.getDriverName());
			System.out.println("DB driver version:" + meta.getDriverVersion());

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}

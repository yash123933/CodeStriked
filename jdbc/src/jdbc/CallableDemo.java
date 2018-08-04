package jdbc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CallableDemo {
	public static void main(String[] args) {
		Connection conn=null;
		try {
			conn=JdbcUtil.getConnection();
			CallableStatement stmt = conn.prepareCall("{call getName(?,?)}");
			stmt.setInt(1, 121);
			stmt.registerOutParameter(2,Types.VARCHAR);
			stmt.execute();
			System.out.println("Name: "+ stmt.getString(2));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {

			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}

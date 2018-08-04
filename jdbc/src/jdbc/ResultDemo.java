package jdbc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultDemo {

	public static void main(String[] args) {
		Connection conn = null;
		String sql = "select * from product";
		try {

			conn = JdbcUtil.getConnection();
			ResultSet rs = conn.createStatement().executeQuery(sql);//result set works in attach format
			ResultSetMetaData metadata=rs.getMetaData();
			for(int c=1;c<=metadata.getColumnCount();c++)
				System.out.println(metadata.getColumnName(c)+"\t");
			while (rs.next())
				System.out.println(rs.getInt(1) + "\t" + rs.getString("name") + "\t" + rs.getString(3));
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

	}
}

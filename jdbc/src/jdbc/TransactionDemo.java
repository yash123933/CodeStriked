package jdbc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {
	public static void main(String[] args) {
		Connection conn = null;
		String sql = "insert into product values(112,'White Board',500)";
		String sql1 = "update product set price=30 where code=121";
		String sql2 = "delete from product where code= 120";
		try {
			conn = JdbcUtil.getConnection();
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			stmt.addBatch(sql);
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.executeBatch();
			conn.commit();
			System.out.println("Transaction Complete");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Transaction failed");
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
			}
			finally {

				try {
					if (conn != null)
						conn.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}

	}
}

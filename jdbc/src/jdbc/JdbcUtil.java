package jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public final class JdbcUtil {
public static Connection getConnection() throws SQLException, ClassNotFoundException, FileNotFoundException, IOException
{
	Properties p=new Properties();
	p.load(new FileReader("src/database.info"));
	Connection conn = null;
	Class.forName(p.getProperty("driver"));
	conn = DriverManager.getConnection(p.getProperty("url"), p.getProperty("user"), p.getProperty("pass"));
//	System.out.println("Connection Succesful");
	return conn;
	
	}
}

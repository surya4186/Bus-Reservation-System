package bus;

import java.sql.*;

public class DbConnection {
	 private static String url="jdbc:mysql://localhost:3306/Busresv";
	 private static String userName="root";
	 private static String passWord="1234";
	
	public static Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection(url,userName,passWord);
	}
	
	
}

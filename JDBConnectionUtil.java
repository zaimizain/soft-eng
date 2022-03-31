package assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBConnectionUtil {
	private static final String URL = "jdbc:mysql://localhost:3306/mysqljdbc";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "208229";
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	
	private static Connection connection = null;

	public static Connection openConnection() {
		if (connection != null)
			return connection;
		else {
			try {
				Class.forName(DRIVER);
				connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}  
			catch (SQLException e) {
				e.printStackTrace();
			}
			return connection;
		}
	}
	
}

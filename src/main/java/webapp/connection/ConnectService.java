package webapp.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectService {
	
	
	private static String driverName; 
	private static String url;
	private static Statement statement;
	
	
	static {
		driverName = "oracle.jdbc.driver.OracleDriver";
		url = "jdbc:oracle:thin:@localhost:1521:xe";
		statement= null; 
		
	}
	
	
	public ConnectService() {
		super();
		try {
			Class.forName(driverName); 
			Connection connection = DriverManager.getConnection(url, "hr", "hr");
			statement = connection.createStatement();
			
		}
		catch (ClassNotFoundException e) {
			//System.out.println("error");
			System.out.println(e);
		}
		catch (SQLException e) {
				System.out.println("error");
				System.out.println(e.getMessage());
			}
	}
	
	
	public ResultSet executeQuery (String query) {
		ResultSet resultSet = null;	
		try {
			resultSet = statement.executeQuery(query);
			
			} 
			catch (SQLException e) {
				System.out.println("error");
				System.out.println(e.getMessage());
			}
			return resultSet;
	}
	

}

package webapp.login;

import java.sql.ResultSet;
import java.sql.SQLException;

import webapp.connection.ConnectService;

public class LoginValidation {
	
	public boolean isValid(String name , String password) {
		
		ConnectService connectService = new ConnectService(); 
		
		String query = "select (1) from login_info where user_name = '" + name + "' and password = '"+ password+ "'";
		int valid = 0; 
		
		try {
			ResultSet result = connectService.executeQuery(query);
			result.next();
			valid = result.getInt(1);
		}
		catch (SQLException e) { 
			System.out.println(e.getMessage()); 
		}
		
		if (valid == 0) 
			return false; 
		return true; 
	
	}

}

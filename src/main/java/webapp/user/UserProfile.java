package webapp.user;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import webapp.connection.ConnectService;

public class UserProfile {

	ConnectService connectService = new ConnectService();

	public String getName(String userName) {
		String name = null;
		String query = "select emp.first_name || ' ' || emp.last_name from employees emp ,login_info log  "
				+ "		where log.id = emp.employee_id " + "		and log.id = (select id from login_info"
				+ "						where user_name = '" + userName + "')";

		try {
			ResultSet result = connectService.executeQuery(query);
			result.next();
			name = result.getString(1);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return name;

	}

	public String getID(String userName) {
		String id = null;
		String query = "select log.id from login_info log  " + "	where log.user_name = '" + userName + "'";

		try {
			ResultSet result = connectService.executeQuery(query);
			result.next();
			id = result.getString(1).toString();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return id;

	}

	public String getRole(String userName) {
		String role = null;
		String query = "select log.role from login_info log  " + "	where log.user_name = '" + userName + "'";

		try {
			ResultSet result = connectService.executeQuery(query);
			result.next();
			role = result.getString(1).toString();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return role;

	}

	public Employee getProfile(String id) {

		String query = "select * from employees	where employee_id = " + id;
		String employeeID = null;
		String firstName= null;
		String lastName= null;
		String email= null;
		String phoneNumber= null;
		Date hireDate= null;
		String job_id= null;
		String salary= null;
		String commission= null;
		String managerID= null;
		String departmentID= null;
		try {
			ResultSet result = connectService.executeQuery(query);
			result.next();
			employeeID = result.getString(1).toString();
			firstName = result.getString(2); 
			lastName = result.getString(3);
			email = result.getString(4);
			phoneNumber = result.getString(5);
			hireDate = result.getDate(6); 
			job_id = result.getString(7).toString(); 
			salary = result.getString(8).toString(); 
			commission = result.getString(9).toString();
			managerID = result.getString(10).toString(); 
			departmentID = result.getString(11).toString(); 
		
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Employee employee = new Employee (employeeID, firstName, lastName, email, phoneNumber, hireDate,
										job_id, salary, commission, managerID, departmentID);
		
		return employee;

	}
	
	public String getDepartment(String id) {
		String dept = null;
		String query = "select department_name from departments "
				+ "where department_id = (select department_id from employees"
				+ "						where employee_id = "+ id +")";
		
		try {
			ResultSet result = connectService.executeQuery(query);
			result.next();
			dept = result.getString(1).toString();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return dept;
		
	}

}

package webapp.user;

import java.util.Date;
import java.util.List;

public class Manager extends Employee{

	private List<Employee> employeesList; 
	
	
	
	public Manager(String id, String firstName, String lastName, String email, String phoneNumber, Date hireDate,
			String job_id, String salary, String commission, String managerID, String departmentID) {
		super(id, firstName, lastName, email, phoneNumber, hireDate, job_id, salary, commission, managerID, departmentID);
		// TODO Auto-generated constructor stub
	}
	public List<Employee> getEmployeesList() {
		return employeesList;
	}
	/**
	 * @param employeesList the employeesList to set
	 */
	public void setEmployeesList(List<Employee> employeesList) {
		this.employeesList = employeesList;
	} 
	
	
}

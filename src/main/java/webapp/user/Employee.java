package webapp.user;

import java.util.Date;

public class Employee {
	
private String id;
private String firstName;
private String lastName;
private String email;
private String phoneNumber;
private Date hireDate;
private String job_id;
private String salary;
private String commission; 
private String managerID; 
private String departmentID;



public Employee(String id, String firstName, String lastName, String email, String phoneNumber, Date hireDate,
		String job_id, String salary, String commission, String managerID, String departmentID) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.hireDate = hireDate;
	this.job_id = job_id;
	this.salary = salary;
	this.commission = commission;
	this.managerID = managerID;
	this.departmentID = departmentID;
}



public String getId() {
	return id;
}



public void setId(String id) {
	this.id = id;
}



public String getFirstName() {
	return firstName;
}



public void setFirstName(String firstName) {
	this.firstName = firstName;
}



public String getLastName() {
	return lastName;
}



public void setLastName(String lastName) {
	this.lastName = lastName;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}



public String getPhoneNumber() {
	return phoneNumber;
}



public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}



public Date getHireDate() {
	return hireDate;
}



public void setHireDate(Date hireDate) {
	this.hireDate = hireDate;
}



public String getJob_id() {
	return job_id;
}



public void setJob_id(String job_id) {
	this.job_id = job_id;
}



public String getSalary() {
	return salary;
}



public void setSalary(String salary) {
	this.salary = salary;
}



public String getCommission() {
	return commission;
}



public void setCommission(String commission) {
	this.commission = commission;
}



public String getManagerID() {
	return managerID;
}



public void setManagerID(String managerID) {
	this.managerID = managerID;
}



public String getDepartmentID() {
	return departmentID;
}



public void setDepartmentID(String departmentID) {
	this.departmentID = departmentID;
}


}
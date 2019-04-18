package com.revature.dao;

import com.revature.beans.Employee;

public interface EmployeeDAO {

	public Employee getEmployeebyCredentials(String username,String password);
	public Employee updateEmployee(Employee employee);
	public Employee getEmployeeById(int id);
	
	public Employee updateEmpUsername(int empId, String username);
	public Employee updateEmpPassword(int empId, String password);
	
	public Employee deleteEmployee(int empId);
	
}

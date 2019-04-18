package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.beans.Employee;
import com.revature.util.ConnectionUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

	public Employee getEmployeebyCredentials(String username, String password) {

		Employee employee = new Employee();
		
		try(Connection con = ConnectionUtil.getConnection()){
			
			String sql = "SELECT * FROM EMPLOYEE WHERE USERNAME = ? AND"
					+ " PASS_WORD = ?";
			
			PreparedStatement pstmt  = con.prepareStatement(sql);
			
			//Set value of the '?' to the value of parameters 
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				employee.setId(rs.getInt("EMPLOYEE_ID"));
				employee.setFirstName(rs.getString("FIRSTNAME"));
				employee.setLastName(rs.getString("LASTNAME"));
				employee.setUserName(rs.getString("USERNAME"));
				employee.setPassWord(rs.getString("PASS_WORD"));
			}
	} catch (SQLException e){
		e.printStackTrace();
	}
		
		return employee;
	}

	public Employee updateEmployee(Employee employee) {
		
		employee = null;
		
		try(Connection con = ConnectionUtil.getConnection()){
			String sql = "UPDATE EMPLOYEE SET"
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return null;
	}

	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmpUsername(int empId, String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmpPassword(int empId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.revature.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Reimbursement;
import com.revature.util.AppState;
import com.revature.util.ConnectionUtil;

public class ReimbursementDAOImpl implements ReimbursementDAO {

	@Override
	public Reimbursement createReimbursement(Reimbursement reim) {
		
		try(Connection con = ConnectionUtil.getConnection())
		{
			String sql = "INSERT INTO REIMBURSEMENT(EMPLOYEE_ID, IMAGE, AMOUNT, MANAGER_ID, STATUS) VALUES(?,?,?,?,?)";
			
			PreparedStatement pstmt  = con.prepareStatement(sql);
			
			//Set value of the first '?' to the value of 'id' 
			pstmt.setInt(1, AppState.getCurrentEmployee().getId());
			pstmt.setBlob(2, reim.getImage());
			pstmt.setDouble(3, reim.getAmount());
			pstmt.setInt(4, reim.getManagerId());
			pstmt.setInt(5, reim.getStatus());
			
			
			
			pstmt.executeUpdate();
			//Result the query and retrieve a ResultSet
			//ResultSet rs = pstmt.executeQuery();
			
//			if(rs.next()) {
//				int accountId = rs.getInt("ACCOUNT_ID");
//				int accountNum = rs.getInt("ACCOUNT_NUMBER");
//				double newBalance = rs.getDouble("BALANCE");
//				account1 = new Account(accountId, accountNum, newBalance);
//			}
		}catch (SQLException e) {
			e.printStackTrace();
		}

		return reim;
	}

	@Override
	public List<Reimbursement> getReimbursements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reimbursement getReimbursementbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reimbursement> getManReimbursements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reimbursement updateStatus(int status, int reimId) {
		// TODO Auto-generated method stub
		return null;
	}

}

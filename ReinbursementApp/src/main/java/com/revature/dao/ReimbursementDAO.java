package com.revature.dao;

import java.util.List;

import com.revature.beans.Reimbursement;

public interface ReimbursementDAO {

	public Reimbursement createReimbursement(Reimbursement reim);
	public List<Reimbursement> getReimbursements();
	public Reimbursement getReimbursementbyId(int id);
	public List<Reimbursement> getManReimbursements();
	public Reimbursement updateStatus(int status, int reimId);
	
}

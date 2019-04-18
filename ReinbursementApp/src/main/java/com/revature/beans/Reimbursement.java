package com.revature.beans;

import java.sql.Blob;

public class Reimbursement {
	
	public Reimbursement() {
		super();
	}
	private int reimId;
	private int employeeId;
	private Blob image;
	private double amount;
	private String dateTime;
	private int managerId;
	private int status;
	

	public Reimbursement(int reimId,int employeeId, Blob image, double amount, String dateTime, int managerId, int status) {
		super();
		this.reimId = reimId;
		this.employeeId = employeeId;
		this.image = image;
		this.amount = amount;
		this.dateTime = dateTime;
		this.managerId = managerId;
		this.status = status;
	}

	public int getEmployeeId() {return employeeId;}
	public void setEmployeeId(int employeeId) {this.employeeId = employeeId;}
	
	public Blob getImage() {return image;}
	public void setImage(Blob image) {this.image = image;}
	
	public double getAmount() {return amount;}
	public void setAmount(double amount) {this.amount = amount;}
	
	public String getDateTime() {return dateTime;}
	public void setDateTime(String dateTime) {this.dateTime = dateTime;}
	
	public int getManagerId() {return managerId;}
	public void setManagerId(int managerId) {this.managerId = managerId;}
	
	public int getStatus() {return status;}
	public void setStatus(int status) {this.status = status;}
	
	public int getReimId() {return reimId;}
	public void setReimId(int reimId) {this.reimId = reimId;}
	
	@Override
	public String toString() {
		return "Reimbursement [employeeId=" + employeeId + ", image=" + image + ", amount=" + amount + ", dateTime="
				+ dateTime + ", managerId=" + managerId + ", status=" + status + "]";
	}

	
	
	
	
	
	
}

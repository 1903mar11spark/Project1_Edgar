package com.revature.beans;

public class ManagerService {
	
	public ManagerService() {
		super();
	}

	private int managerId;
	private int reimId;
	private int decision;
	private String datetime;
	
	public ManagerService(int managerId, int reimId, int decision, String datetime) {
		super();
		this.managerId = managerId;
		this.reimId = reimId;
		this.decision = decision;
		this.datetime = datetime;
	}

	
	public int getManagerId() {return managerId;}
	public void setManagerId(int managerId) {this.managerId = managerId;}
	
	public int getReimId() {return reimId;}
	public void setReimId(int reimId) {this.reimId = reimId;}
	
	public int getDecision() {return decision;}
	public void setDecision(int decision) {this.decision = decision;}
	
	public String getDatetime() {return datetime;}
	public void setDatetime(String datetime) {this.datetime = datetime;}
	
	@Override
	public String toString() {
		return "ManagerService [managerId=" + managerId + ", reimId=" + reimId + ", decision=" + decision
				+ ", datetime=" + datetime + "]";
	}
	
	

}

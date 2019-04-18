package com.revature.beans;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private String userName;
	private String passWord;
	private int managerId;
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String firstName, String lastName, String userName, String passWord, int managerId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.passWord = passWord;
		this.managerId = managerId;
	}
	
	
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	
	public String getFirstName() {return firstName;}
	public void setFirstName(String firstName) {this.firstName = firstName;}
	
	public String getLastName() {return lastName;}
	public void setLastName(String lastName) {this.lastName = lastName;}
	
	public String getUserName() {return userName;}
	public void setUserName(String userName) {this.userName = userName;}
	
	public String getPassWord() {return passWord;}
	public void setPassWord(String passWord) {this.passWord = passWord;}
	
	public int getManagerId() {return managerId;}
	public void setManagerId(int managerId) {this.managerId = managerId;}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", FirstName=" + firstName + ", LastName=" + lastName + ", userName=" + userName
				+ ", passWord=" + passWord + "]";
	}
	
	
}

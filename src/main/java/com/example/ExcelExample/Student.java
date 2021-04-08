package com.example.ExcelExample;

public class Student {

	private int rollNo;
	private String firstName;
	private String LastName;
	private String subject;
	
	



	public Student(int rollNo, String firstName, String lastName, String subject) {
		this.rollNo = rollNo;
		this.firstName = firstName;
		LastName = lastName;
		this.subject = subject;
	}



	public String getFirstName() {
		return firstName;
	}
	
	
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}

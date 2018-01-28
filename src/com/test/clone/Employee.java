package com.test.clone;

public class Employee implements Cloneable {

	private String firstName ;
	private String lastName ;
	
	public Employee(String first, String last){
		this.firstName =  first;
		this.lastName =  last;
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
	
}

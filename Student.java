package com.subodh.SpringBeans;

public class Student {
	private int rollno;
	private String name;
	private Address address;
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("rollno:"+rollno);
		System.out.println("name:"+name);
		System.out.println("Address:"+address);
	}
	
	
	

}

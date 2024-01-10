package com.springmvc.bean;

public class Organization {

	private int id;
	 private String name;
	 private int age;
	 private String company;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Organization(int id, String name, int age, String company) {
	
		this.id = id;
		this.name = name;
		this.age = age;
		this.company = company;
	}
	public Organization() {
		
	}
	 
}

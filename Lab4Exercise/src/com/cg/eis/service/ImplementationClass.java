package com.cg.eis.service;

public class ImplementationClass implements EmployeeService {
	
	protected String name;
	protected int id;
	protected int salary;
	protected String designation;
	protected String insuranceScheme;
	
	public void getDetails() {
		
	}

	public ImplementationClass(String name, int id, int salary, String designation, String insuranceScheme) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}
	
	public void showDetails() {
		System.out.println("Name: " + this.name + ", ID :" + this.id + " Salary: " + this.salary + " Designation: "+ this.designation);;
	}
	
	public void findInsuranceScheme() {
		
		if(this.insuranceScheme.equals("Standard")) {
			
			System.out.println("You have Standard Insurance");
		}
		
		if(this.insuranceScheme.equals("Premium")) {
			
			System.out.println("You have Premium Insurance");
		}
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

	public ImplementationClass() {
		super();
	}
	
}

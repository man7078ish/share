package com.cg.javaintro.bean;

public class Employee {
	
	
	private int empId;
	private String empName;
	private static String compName="Capgemini";
	
	
	public Employee() {
		
	}

	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
    public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public static String getCompName() {
		return compName;
	}

	@Override
	public String toString() {
		return "Employee ID is : " + empId + "\nEmployee Name is : " + empName +
				"\nEmployee company name is: " + compName;
	}

    public void displaySalary()
    {
    	
    	System.out.println("Salary is 10000");
    }

}

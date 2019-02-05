package com.cg.javaintro.bean;

public class Manager extends Employee{

	private String deptName;
	
	public Manager()
	{}
	
	public Manager(int empId, String empName,String deptName )
	{
		super(empId,empName);
		this.deptName=deptName;
	}

	@Override
	public String toString() {
		return super.toString() + "\n Manager Department is : " +deptName;
	}
	
	public void managePeople()
	{
		System.out.println("I am capable of managing people...");
		
	}
	
	public void displaySalary()
	{
		
		System.out.println("Salary is 30000");
	}
	
}

package com.java.employeePayRole;

import java.util.ArrayList;
import java.util.List;


class FullTimeEmployee extends Employee{
 
	private int MonthlySalary;
	
	public FullTimeEmployee(String name, int id , int MonthlySalary) {
		super(name,id);
		this.MonthlySalary=MonthlySalary;
		
	}
	
	@Override
	public double CalculateSalary() {
		// TODO Auto-generated method stub
		return MonthlySalary;
	}
	
}


class PartTimeEmployee extends Employee{
	private double hoursworked;
	private double WeeklyRate;
	
	public PartTimeEmployee (String name,int id , double hoursworked,double WeeklyRate) {
		super(name , id );
		this.hoursworked=hoursworked;
		this.WeeklyRate=WeeklyRate;
		
	}
	
	@Override
	
	public double CalculateSalary() {
		return hoursworked*WeeklyRate;
	}
	
}


class payrollSystem{
	private List<Employee> employeeList;
	
	public payrollSystem() {
		employeeList = new ArrayList<>();
		
	}
	
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}
	
	public void removEmployee(int id) {
		Employee employeeToRemove=null;
		for(Employee employee: employeeList) {
		if(employee.getId()==id) {
			employeeToRemove=employee;
			break;
		}	
		}
		
		if(employeeToRemove!=null) {
			employeeList.remove(employeeToRemove);
		}
		
	}
	
	public void displayEmployee() {
		for(Employee employee:employeeList) {
			System.out.println(employee);
		}
	}
	
}


public class main_PayRoll {

	public static void main(String[] args) {
		payrollSystem payrollSystem=new payrollSystem();
		
		FullTimeEmployee emp1=new FullTimeEmployee("Salman", 1, 40000);
		FullTimeEmployee emp3=new FullTimeEmployee("Asif khan", 3, 30000);
		PartTimeEmployee emp2=new PartTimeEmployee("Sameer", 2, 100d, 100d);
		
		payrollSystem.addEmployee(emp1);
		payrollSystem.addEmployee(emp2);
		payrollSystem.addEmployee(emp3);
		
		System.out.println("Initial Employee Details:");
		payrollSystem.displayEmployee();
		
		System.out.println("\nRemoving Employee...");
		payrollSystem.removEmployee(2);
		
		
		System.out.println("\nRemaining Employee Details:");
	    payrollSystem.displayEmployee();

	}
	
	
}

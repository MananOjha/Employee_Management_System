package com.handle.admin;

import java.util.HashSet;
import java.util.Set;

import com.handle.employees.Employee;

// Represent Employee DataBase

public class EmployeeDB {
	private static EmployeeDB empDBRef;
	
	private Set<Employee> empDB = new HashSet<Employee>();
		// used to store records of Employee in Set format.
	
	private EmployeeDB() {
		
	}
	
	public Set<Employee> getEmpSet() {
		return this.empDB;
	}
	
	public static EmployeeDB getInstance() {
		if(empDBRef == null) {
			empDBRef = new EmployeeDB();
		}
		
		return empDBRef;
	}
}

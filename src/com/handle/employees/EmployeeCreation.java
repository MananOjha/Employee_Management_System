package com.handle.employees;

public class EmployeeCreation {
	private static int initNum = 10001;
	
	public Employee createEmployee(String eName, Long ePhone, String eEmail,
			Double eSalary, String Designation, Double exp, char empType) {
		
		Employee emp = null;
		
		if(empType == 'p') {
			emp = new PermanentEmployee(initNum++, eName, ePhone, eEmail, eSalary, Designation, exp, true, 100);
		}
		else if (empType == 'c') {
			emp = new ContractEmployee(initNum++, eName, ePhone, eEmail, eSalary, Designation, exp, false, 120);
		}
		
		return emp;
	}
}

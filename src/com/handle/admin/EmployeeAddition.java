package com.handle.admin;

import com.handle.employees.Employee;

public class EmployeeAddition {

	public void addEmployee(Employee employee) {
		
//		EmployeeDB eDB = EmployeeDB.getInstance();
//		eDB.getEmpDB().add(employee);
		
		EmployeeDB.getInstance().getEmpSet().add(employee);
	}
}

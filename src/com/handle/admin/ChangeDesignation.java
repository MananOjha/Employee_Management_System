package com.handle.admin;

import com.handle.employees.Employee;

public class ChangeDesignation {
	public void changeDesignation(Employee employee, String designation) {
		employee.setDesignation(designation);
		System.out.println("Designation is updated...!");
	}
}

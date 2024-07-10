package com.handle.admin;

import com.handle.employees.Employee;

public class ChangeExperience {
	public void changeExperience(Employee employee, Double exp) {
		employee.setExp(exp);
		System.out.println("Experience has been updated...!");
	}
}

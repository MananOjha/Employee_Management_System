package com.handle.admin;

import com.handle.employees.Employee;

public class SalaryUpdation {
	public void updateSalary(Employee e1, Double salary) {
		
		e1.seteSalary(e1.geteSalary() + salary);
		System.out.println("Salary is Updated");
	}
}

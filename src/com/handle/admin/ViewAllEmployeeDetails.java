package com.handle.admin;

import java.util.Set;

import com.handle.employees.Employee;

public class ViewAllEmployeeDetails {

	public void viewDetails() {
		Set<Employee> eSet = EmployeeDB.getInstance().getEmpSet();
		
		for (Employee employee : eSet) {
			System.out.println(employee.geteId() + "\t" + employee.geteName() + "\t" +
					employee.geteSalary() + "\t" + employee.getExp() + "\t" +
					employee.getDesignation() + "\t" + employee.getePhone() + "\t" +
					employee.geteEmail());
		}
	}
}

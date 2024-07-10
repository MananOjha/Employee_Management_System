package com.handle.admin;

import java.util.Set;

import com.handle.employees.Employee;

public class EmployeeSearchByEmail {
	
	public void search(String email) {
	Employee foundEmployee = null;
			
		Set<Employee> eSet = EmployeeDB.getInstance().getEmpSet();
			
		for (Employee employee : eSet) {
			System.out.println("Employee Found...!");
			if(employee.geteEmail().equals(email)) {
				foundEmployee = employee;
				break;
			}
		}
			
		if(foundEmployee != null) {
			System.out.println(foundEmployee.geteId() + "\t" + foundEmployee.geteName() + "\t" +
					foundEmployee.geteSalary() + "\t" + foundEmployee.getExp() + "\t" +
					foundEmployee.getDesignation() + "\t" + foundEmployee.getePhone() + "\t" +
					foundEmployee.geteEmail());
		} else {
			System.out.println("Employee not found in DataBase...!");
		}
	}
}

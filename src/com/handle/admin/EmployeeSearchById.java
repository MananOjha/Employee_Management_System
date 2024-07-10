package com.handle.admin;

import java.util.Set;

import com.handle.employees.Employee;

public class EmployeeSearchById {
	public void search(Integer id) {
		Employee foundEmployee = null;
		
		Set<Employee> eSet = EmployeeDB.getInstance().getEmpSet();
		
		for (Employee employee : eSet) {
			if(employee.geteId().equals(id)) {
				System.out.println("Employee Found...!");
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

package com.handle.admin;

import java.util.Set;

import com.handle.employees.Employee;

public class EmployeeSearchByPhoneNo {
	
	public void search(Long phoneNo) {
		Employee foundEmployee = null;
		
		Set<Employee> eSet = EmployeeDB.getInstance().getEmpSet();
		
		for (Employee employee : eSet) {
			System.out.println("Employee Found...!");
			if(employee.getePhone().equals(phoneNo)) {
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

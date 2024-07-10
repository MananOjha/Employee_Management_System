package com.handle.admin;

import com.handle.employees.Employee;
import com.handle.employees.PermanentEmployee;

public class RewardBonus {
	
	public void addBonus(Employee employee, Double reward) {
		if(employee instanceof PermanentEmployee && employee.getIsEligibleForBonus()) {
			employee.seteSalary(employee.geteSalary() + reward);
			System.out.println("Hurry... Employee got a Bonus...!");
		} else {
			System.out.println("This is not a permanent employee...!");
		}
	}
}

package com.handle.admin;

import com.handle.employees.ContractEmployee;
import com.handle.employees.Employee;

public class ContractPeriodExtension {
	public void contractPeriodExtension(Employee employee, Integer contractPeriod) {
		if(employee instanceof ContractEmployee) {
			((ContractEmployee) employee).setContractPeriod(((ContractEmployee) employee).getContractPeriod() + contractPeriod);
		} else {
			System.out.println("Employee doesn't have contract...!");
		}
	}
}

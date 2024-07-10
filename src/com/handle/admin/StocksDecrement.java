package com.handle.admin;

import com.handle.employees.Employee;
import com.handle.employees.PermanentEmployee;

public class StocksDecrement {
	public void stockDecrement(Employee employee, Integer stocks) {
		if(employee instanceof PermanentEmployee) {
			((PermanentEmployee) employee).setStocks(((PermanentEmployee) employee).getStocks() - stocks);
		}
		else {
			System.out.println("Employee has not been permanent...!");
		}
	}
}

package com.handle.admin;

import com.handle.employees.Employee;
import com.handle.employees.PermanentEmployee;

public class StockIncrement {

	public void stockIncrement(Employee employee, Integer stocks) {
		if(employee instanceof PermanentEmployee) {
			((PermanentEmployee) employee).setStocks(((PermanentEmployee) employee).getStocks() + stocks);
		} else {
			System.out.println("Employee is not permanent...!");
		}
	}
}

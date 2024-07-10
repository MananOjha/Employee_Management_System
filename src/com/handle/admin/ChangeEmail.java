package com.handle.admin;

import com.handle.employees.Employee;

public class ChangeEmail {
	public void changeEmail(Employee employee, String email) {
		employee.seteEmail(email);
		System.out.println("Email is Updated...!");
	}
}

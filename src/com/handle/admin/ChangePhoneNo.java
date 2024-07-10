package com.handle.admin;

import com.handle.employees.Employee;

public class ChangePhoneNo {
	public void changePhoneNo(Employee employee, Long phoneNo) {
		employee.setePhone(phoneNo);
		System.out.println("Phone no. Updated...!");
	}
}

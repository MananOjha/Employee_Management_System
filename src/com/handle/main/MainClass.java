package com.handle.main;

import com.handle.admin.EmployeeAddition;
import com.handle.admin.EmployeeSearchById;
import com.handle.admin.ViewAllEmployeeDetails;
import com.handle.admin.setUpApp;
import com.handle.employees.Employee;
import com.handle.employees.EmployeeCreation;

public class MainClass {
	public static void main(String[] args) {
		
		System.out.println("----------------------------------");
		System.out.println("Welcome to EMS app");
		System.out.println("----------------------------------");
		
		Employee e1 = new EmployeeCreation().createEmployee(
				"Martin",
				6398569789l,
				"martin@gmail.com",
				40000.00,
				"Trainee",
				0.9,
				'p');
		
		Employee e2 = new EmployeeCreation().createEmployee(
				"Scott",
				6398568969l,
				"scott@gmail.com",
				45000.00,
				"Intern",
				0.6,
				'c');
		
//		new EmployeeAddition().addEmployee(e1);
//		new EmployeeAddition().addEmployee(e2);
//		new ViewAllEmployeeDetails().viewDetails();
//		
//		System.out.println();
//		new EmployeeSearchById().search(10002);
		

		setUpApp.ea.addEmployee(e1);
		setUpApp.ea.addEmployee(e2);
		setUpApp.vAED.viewDetails();
		
		System.out.println();
		setUpApp.eSI.search(10002);
	}

}

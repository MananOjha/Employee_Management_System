package com.handle.main;

import java.util.Scanner;

import com.handle.admin.EmployeeSearchByEmail;
import com.handle.admin.EmployeeSearchById;
import com.handle.admin.EmployeeSearchByName;
import com.handle.admin.EmployeeSearchByPhoneNo;
import com.handle.admin.setUpApp;

public class Main1 {
	static Scanner sc = new Scanner(System.in);
	
	public static void menu() {
		System.out.println("Enter your Choice : ");
		System.out.println("1. Create an Employee");
		System.out.println("2. View All Employee Details");
		System.out.println("3. Search an Employee");
		System.out.println("4. Update Details");
		System.out.println("5. Remove an Employee");
		System.out.println("6. Exit the app");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1 : 
			create();
			menu();
			break;
		
		case 2 :
			viewAll();
			menu();
			break;
		
		case 3 :
			search();
			menu();
			break;
			
		case 4 : 
			update();
			menu();
			break;
		
		case 5 :
			remove();
			menu();
			break;
			
		case 6 :
			break;
			
		default :
			System.out.println("Your Entered Wrong Choice");
			menu();
		}
	}
	
	public static void tableFormat() {
		System.out.println("----------------------------------------------");
		System.out.println("Emp_ID \t Name \t Ph_Number");
		System.out.println("----------------------------------------------");
	}
	
	public static void create() {
		System.out.println("Enter name of Employee : ");
		String name = sc.nextLine();
		sc.next();
		System.out.println("Enter mobile Number of Employee : ");
		Long mobile = sc.nextLong();
		System.out.println("Enter Email address of Employee : ");
		String email = sc.nextLine();
		sc.next();
		System.out.println("Enter Salary of Employee : ");
		Double salary = sc.nextDouble();
		System.out.println("Enter Designation of Employee : ");
		String designation = sc.nextLine();
		sc.next();
		System.out.println("Enter Experience of Employee : ");
		Double experience = sc.nextDouble();
		System.out.println("Enter Category of Employee (Permanent/Contract)");
		char empType = sc.next().charAt(0);
		
	}
	
	public static void viewAll() {
		setUpApp.vAED.viewDetails();
	}
	
	public static void search() {
		System.out.println("Enter your Choice for Search");
		System.out.println("1. Search by ID");
		System.out.println("2. Search by Name");
		System.out.println("3. Search by Mobile No");
		System.out.println("4. Search by Email");
		
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1 :
				System.out.println("Enter the ID : ");
				Integer id = sc.nextInt();
				new EmployeeSearchById().search(id);
				break;
			
			case 2 : 
				System.out.println("Enter the Name : ");
				String name = sc.nextLine();
				sc.next();
				new EmployeeSearchByName().search(name);
				break;
		
			case 3 : 
				System.out.println("Enter the Mobile number : ");
				Long mobile = sc.nextLong();
				new EmployeeSearchByPhoneNo().search(mobile);
				break;
				
			case 4 : 
				System.out.println("Enter the Name : ");
				String email = sc.nextLine();
				sc.next();
				new EmployeeSearchByEmail().search(email);
				break;
				
			default : 
				System.out.println("You Entered wrong choice.");
				search();
		}
	}
	
	public static void update() {
		
	}
	
	public static void remove() {
		
	}
	
	public static void main(String args[]) {
		System.out.println("-----------------------------------");
		System.out.println("           WELCOME TO EMS          ");
		System.out.println("-----------------------------------");
		
		menu();
	}
}

package com.employee.app;

import java.util.Scanner;

import com.employee.model.Employee;
import com.employee.service.EmployeeServiceimpl;

public class DriverApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter First Name : ");
		String firstName = sc.next();
		System.out.println("Enter Last Name : ");
		String lastName = sc.next();
		Employee emp = new Employee ();
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		EmployeeServiceimpl tkg = new EmployeeServiceimpl();
		System.out.println("1. Technical ");
		System.out.println("2. Admin ");
		System.out.println("3. H.R ");
		System.out.println("4. Legal ");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		String gEmail = "";
		String gPassword = "";
		switch (choice)
		{
		case 1 : gEmail = tkg.generateUserEmail(emp.getFirstName(), emp.getLastName(), "tech");
				break;
		case 2 : gEmail = tkg.generateUserEmail(emp.getFirstName(), emp.getLastName(), "admin");
			break;
		case 3 : gEmail = tkg.generateUserEmail(emp.getFirstName(), emp.getLastName(), "hr");
			break;
		case 4 : gEmail = tkg.generateUserEmail(emp.getFirstName(), emp.getLastName(), "legal");
			break;
		default : 
			System.out.println("Please enter valid input");
		}
		gPassword = tkg.generateUserPassword();
		emp.setUserEmail(gEmail);
		emp.setPassword(gPassword);
		tkg.displayEmployeeDetails(emp);
	}

}

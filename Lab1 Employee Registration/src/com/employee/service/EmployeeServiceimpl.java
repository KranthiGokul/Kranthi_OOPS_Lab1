package com.employee.service;

import com.employee.model.Employee;
import java.util.*;

public class EmployeeServiceimpl implements EmployeeService {

	@Override
	public String generateUserEmail(String firstName, String lastName, String departmentName) {
		// TODO Auto-generated method stub
		return firstName + lastName + "@" + departmentName + ".gl.com";
	}

	@Override
	public String generateUserPassword() {
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
		String splChar = "!@#$%^&*()";
		String combined = caps + lower + num + splChar;
		System.out.println(combined.length());
		String password = "";
		
		Random random = new Random();
		
		for (int i = 1; i <= 8; i++ ) {
			password += String.valueOf(combined.charAt(random.nextInt(combined.length())));
		}
		return password;
	}

	@Override
	public String displayEmployeeDetails(Employee el) {
		System.out.println("Employee First Name is " + el.getFirstName());
		System.out.println("Employee Last Name is " + el.getLastName());
		System.out.println("Employee UserName is " + el.getUserEmail());
		System.out.println("EMployee Password is " + el.getPassword());
		
		// TODO Auto-generated method stub
		return null;
	}

}

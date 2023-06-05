package com.employee.service;

import com.employee.model.Employee;

public interface EmployeeService {
	String generateUserEmail(String firstName, String lastName, String departmentName);
	String generateUserPassword();
	String displayEmployeeDetails(Employee el);
}

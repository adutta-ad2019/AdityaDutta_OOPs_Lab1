package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface EmployeeService {
	String generateEmailId(String fname,String lname,String dept);
	String generatePassword();
	void showEmployeeDetails(Employee e);
}

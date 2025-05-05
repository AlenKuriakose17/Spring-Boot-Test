package com.luminar.service;

import java.util.List;

import com.luminar.model.EmployeeModel;

public interface EmployeeService {
	List<EmployeeModel> getAllEmployees();

	void saveEmployee(EmployeeModel employee);

	void deleteEmployeeById(long id);
}

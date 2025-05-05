package com.luminar.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.luminar.model.EmployeeModel;
import com.luminar.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<EmployeeModel> getAllEmployees(){
		return employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(EmployeeModel employee) {
		this.employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(long id) {
		this.employeeRepository.deleteById(id);
	}

}

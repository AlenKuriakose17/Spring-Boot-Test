package com.luminar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luminar.model.EmployeeModel;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel,Long> {

}

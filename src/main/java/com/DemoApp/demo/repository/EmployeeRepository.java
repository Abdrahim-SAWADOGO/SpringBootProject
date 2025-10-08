package com.DemoApp.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.DemoApp.demo.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}

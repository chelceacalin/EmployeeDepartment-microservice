package com.employeeService.employeeservice.repository;

import com.employeeService.employeeservice.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class EmployeeRepository {

	List<Employee> employeeList = new ArrayList<>();


	public Employee addDepartment(Employee department) {
		this.employeeList.add(department);
		return department;
	}

	public Employee findById(Long id) {
		return employeeList.stream().filter(employee -> Objects.equals(employee.id(), id)).findFirst().orElseThrow();
	}

	public List<Employee> findByDepartmentId(Long departmentId) {
		return employeeList.stream().filter(employee -> Objects.equals(employee.departmentId(), departmentId)).toList();
	}


	public List<?> findAll() {
		return this.employeeList;
	}

}

package com.services.departmentService.client;

import com.services.departmentService.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface EmployeeClient {

	@GetExchange("/employee/department/{departmentId}")
	List<Employee> findByDepartmentId(@PathVariable(name = "departmentId") Long id);
}

package com.employeeService.employeeservice.controller;


import com.employeeService.employeeservice.model.Employee;
import com.employeeService.employeeservice.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/employee")
public class EmployeeController {

	private final EmployeeRepository employeeRepository;


	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee) {
		log.info("Employee add {}", employee);
		return employeeRepository.addDepartment(employee);
	}

	@GetMapping("/{id}")
	public Employee findById(@PathVariable Long id) {
		log.info("Employee find by id {} ", id);
		return employeeRepository.findById(id);
	}

	@GetMapping("/department/{departmentId}")
	public List<Employee> findByDepartmentId(@PathVariable(name = "departmentId") Long id) {
		log.info("Employee find by department id  id {} ", id);
		return employeeRepository.findByDepartmentId(id);
	}

	@GetMapping
	public List<?> findAll() {
		log.info("Employee find all");
		return employeeRepository.findAll();
	}

}

package com.services.departmentService.controller;


import com.services.departmentService.client.EmployeeClient;
import com.services.departmentService.model.Department;
import com.services.departmentService.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
@RequiredArgsConstructor
@Slf4j
public class DepartmentController {

	private final DepartmentRepository departmentRepository;
	private final EmployeeClient employeeClient;

	@PostMapping
	public Department addDepartment(@RequestBody Department department) {
		log.info("Department add {}", department);
		return departmentRepository.addDepartment(department);
	}


	@GetMapping("/{id}")
	public Department findById(@PathVariable Long id) {
		log.info("Department find by id {} ", id);
		return departmentRepository.findById(id);
	}

	@GetMapping
	public List<?> findAll() {
		log.info("Department find all");
		return departmentRepository.findAll();
	}


	@GetMapping("/with-employees")
	public List<Department> findAllWithEmployees() {
		log.info("With employees");
		return departmentRepository.findAll().stream().map(dep -> {
			((Department) dep).setEmployeeList(employeeClient.findByDepartmentId(((Department) dep).getId()));
			return ((Department) dep);
		}).toList();
	}
}

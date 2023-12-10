package com.employeeService.employeeservice.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public class Department {

	private Long id;
	private String name;

	public Department(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	private List<Employee> employeeList = new ArrayList<>();


}

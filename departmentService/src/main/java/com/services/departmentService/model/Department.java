package com.services.departmentService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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

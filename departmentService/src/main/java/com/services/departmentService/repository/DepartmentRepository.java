package com.services.departmentService.repository;

import com.services.departmentService.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class DepartmentRepository {

	List<Department> departmentList = new ArrayList<>();


	public Department addDepartment(Department department) {
		this.departmentList.add(department);
		return department;
	}

	public Department findById(Long id) {
		return departmentList.stream().filter(department -> Objects.equals(department.getId(), id)).findFirst().orElseThrow();
	}

	public List<?> findAll(){
		return this.departmentList;
	}

}

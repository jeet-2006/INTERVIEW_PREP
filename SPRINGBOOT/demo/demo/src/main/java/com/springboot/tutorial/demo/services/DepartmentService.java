package com.springboot.tutorial.demo.services;

import com.springboot.tutorial.demo.Entity.Department;
import com.springboot.tutorial.demo.error.DepartmentNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public String deleteDepartmentById(Long departmentId);

    public Department uppdateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);
}

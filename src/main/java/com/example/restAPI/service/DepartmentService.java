package com.example.restAPI.service;

import com.example.restAPI.model.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartment();

    public Department fetchDepartmentByID(Long departmentID);

    public void deleteDepartment(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);
}

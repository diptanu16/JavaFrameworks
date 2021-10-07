package com.springboot.practice.SpringbootPractice.service;

import com.springboot.practice.SpringbootPractice.entity.Department;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);

  public List<Department> fetchDepartmentList();

    public Department fetchDepartmentId(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);
}

package com.springboot.practice.SpringbootPractice.controller;


import com.springboot.practice.SpringbootPractice.entity.Department;
import com.springboot.practice.SpringbootPractice.service.DepartmentService;
import com.springboot.practice.SpringbootPractice.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
        }
    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentId(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted successfully";
    }
    @PutMapping("/departments/{id}")
    public Department updateDepartment(Long departmentId,@RequestBody Department department){
        return departmentService.updateDepartment(departmentId,department);


    }
}



package com.crud.controller;

import com.crud.entity.Employee;
import com.crud.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Restful Controller
@RestController
@RequestMapping("/employee")
public class EmployeeControl {

    @Autowired
    private EmployeeServiceImpl service;

    @PostMapping("/add")
    public Employee addData(@RequestBody Employee model){
        return service.addData(model);
    }

    @GetMapping("/viewall")
    public List<Employee> viewall(){
        return service.viewall();
    }

    @GetMapping("/view/name/{name}")
    public List<Employee> view(@PathVariable("name") String name){
        return service.viewByName(name);
    }

    @GetMapping("view/NameAndDepartment/{name}/{department}")
    public List<Employee> view(@PathVariable("name") String name, @PathVariable("department") String department){
        return service.viewByNameAndDepartment(name, department);
    }

    @PutMapping("/update/{id}")
    public Employee updateData(@PathVariable("id") long id, @RequestBody Employee model){
        return service.updateData(id, model);
    }

    @PutMapping("update/name/{name}")
    public Employee updateData(@PathVariable("name") String name, @RequestBody Employee model){
        return service.updateDataByName(name, model);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteId(@PathVariable("id") Long id){
        service.deleteData(id);
    }
}

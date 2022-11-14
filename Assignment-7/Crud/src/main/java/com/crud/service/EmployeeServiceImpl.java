package com.crud.service;

import com.crud.entity.Employee;
import com.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

    @Autowired
    private EmployeeRepository repo;

    // Adding the data
    public Employee addData(Employee model){
        return repo.save(model);
    }

    // Viewing the data
    public List<Employee> viewall(){
        return repo.findAll();
    }

    // View the data by name
    public List<Employee> viewByName(String name){
        return repo.findByName(name);
    }

    // View the data by name and department
    public List<Employee> viewByNameAndDepartment(String name, String department){
        return repo.findByNameAndDepartment(name, department);
    }

    // Update the data
    public Employee updateData(long id, Employee model){
        return repo.save(model);
    }

    // Update the data using name
    public Employee updateDataByName(String name, Employee model){
        return repo.save(model);
    }

    // Delete the data
    public String deleteData(long id){
        repo.deleteById(id);
        return "ID Deleted";
    }
}

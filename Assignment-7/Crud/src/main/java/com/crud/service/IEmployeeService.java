package com.crud.service;

import com.crud.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    public Employee addData(Employee model);
    public List<Employee> viewall();
    public List<Employee> viewByName(String name);
    public List<Employee> viewByNameAndDepartment(String name, String department);
    public Employee updateData(long id, Employee model);
    public Employee updateDataByName(String name, Employee model);
    public String deleteData(long id);
}

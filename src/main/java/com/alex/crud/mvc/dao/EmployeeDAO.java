package com.alex.crud.mvc.dao;

import com.alex.crud.mvc.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
}

package com.alex.mvc.service;

import com.alex.mvc.dao.EmployeeDAO;
import com.alex.mvc.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}

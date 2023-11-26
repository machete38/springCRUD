package com.machete38.springCRUD.service;

import com.machete38.springCRUD.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> get();
    Employee get(int id);
    void save(Employee emp);
    void delete(int id);
}

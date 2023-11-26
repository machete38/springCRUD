package com.machete38.springCRUD.dao;

import com.machete38.springCRUD.model.Employee;

import java.util.List;

public interface EmployeeDAO
{
    List<Employee> get();
    Employee get(int id);
    void save(Employee emp);
    void delete(int id);


}

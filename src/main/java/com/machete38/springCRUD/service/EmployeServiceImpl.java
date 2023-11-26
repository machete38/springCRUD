package com.machete38.springCRUD.service;

import com.machete38.springCRUD.dao.EmployeeDAO;
import com.machete38.springCRUD.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Transactional
    @Override
    public List<Employee> get() {
        return employeeDAO.get();
    }
    @Transactional
    @Override
    public Employee get(int id) {
        return null;
    }
    @Transactional
    @Override
    public void save(Employee emp) {
        employeeDAO.save(emp);
    }
    @Transactional
    @Override
    public void delete(int id) {

    }
}

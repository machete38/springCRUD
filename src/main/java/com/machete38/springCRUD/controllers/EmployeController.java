package com.machete38.springCRUD.controllers;

import com.machete38.springCRUD.model.Employee;
import com.machete38.springCRUD.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeController {


    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/employee")
    public List<Employee> get(){
        return employeeService.get();
    }

    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employeeObj){
        employeeService.save(employeeObj);
        return employeeObj;
    }
}

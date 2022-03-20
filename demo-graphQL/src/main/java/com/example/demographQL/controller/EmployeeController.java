package com.example.demographQL.controller;

import com.example.demographQL.entity.Employee;
import com.example.demographQL.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

   @Autowired
   private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @PostMapping("/employees")
    public Employee createEmployee( @RequestBody Employee employee) {
            return employeeRepository.save(employee);
    }

    @GetMapping("/employees/{id}")
    public Optional<Employee> getEmpById(@PathVariable("id") Long id) {
        Optional<Employee> e = employeeRepository.findById(id);
       return e;
        }


 /*   @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee e) {
        return employeeRepository.
    }*/
}

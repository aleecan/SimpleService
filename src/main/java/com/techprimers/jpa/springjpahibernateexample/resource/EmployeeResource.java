package com.techprimers.jpa.springjpahibernateexample.resource;

import com.techprimers.jpa.springjpahibernateexample.model.Employee;
import com.techprimers.jpa.springjpahibernateexample.model.Products;
import com.techprimers.jpa.springjpahibernateexample.model.Users;
import com.techprimers.jpa.springjpahibernateexample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/rest/employee")
public class EmployeeResource {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/all")
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }


    @GetMapping("/id/{id}")
    public Employee getId(@PathVariable("id") final Integer id) {
        return employeeRepository.findOne(id);
    }

}

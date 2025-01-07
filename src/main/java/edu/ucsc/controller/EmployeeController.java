package edu.ucsc.controller;

import edu.ucsc.dto.Employee;
import edu.ucsc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @GetMapping
    public List<Employee> getStudent() {
        return service.getStudent();
    }

    @PostMapping
    public void addStudent(@RequestBody Employee employee){

        service.addStudent(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Integer id){
        service.deleteStudentById(id);
    }

    @PutMapping
    public void updateStudent(@RequestBody Employee employee){
        service.addStudent(employee);
    }



}

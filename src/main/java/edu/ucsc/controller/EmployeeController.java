package edu.ucsc.controller;

import edu.ucsc.dto.Employee;
import edu.ucsc.service.EmployeeService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/employee")
@RequiredArgsConstructor
@Slf4j
public class EmployeeController {

   final EmployeeService service;

    @GetMapping
    public List<Employee> getStudent() {
        return service.getStudent();
    }

    @PostMapping
    public void addStudent(@RequestBody Employee employee ,HttpServletRequest request){
        String browserDetails =request.getHeader("User-Agent");
        log.info("Request Received {}{}",employee, browserDetails);
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

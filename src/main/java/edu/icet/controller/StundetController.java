package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StundetController {
    @Autowired
    StudentService service;

    @GetMapping
    public List<Student>  getStudent() {
        return service.getStudent();
    }
}

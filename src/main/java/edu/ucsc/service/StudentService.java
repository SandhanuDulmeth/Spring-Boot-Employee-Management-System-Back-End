package edu.ucsc.service;


import edu.ucsc.dto.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudent();
    void addStudent(Student student);

    void deleteStundetById(Integer id);

    List<Student> findByName(String name);
}

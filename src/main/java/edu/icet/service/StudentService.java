package edu.icet.service;


import edu.icet.dto.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudent();
    void addStudent(Student student);

    void deleteStundetById(Integer id);
}

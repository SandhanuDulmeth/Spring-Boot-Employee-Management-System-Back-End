package edu.ucsc.service;


import edu.ucsc.dto.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getStudent();
    void addStudent(Employee employee);

    void deleteStudentById(Integer id);


}

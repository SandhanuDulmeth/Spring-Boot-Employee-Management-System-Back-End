package edu.ucsc.service;

import edu.ucsc.dto.Employee;
import edu.ucsc.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@Primary
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository repository;

    @Override
    public List<Employee> getStudent() {
        return repository.findAll();
    }

    @Override
    public void addStudent(Employee employee) {
        repository.save(employee);
    }

    @Override
    public void deleteStudentById(Integer id) {
        repository.deleteById(id);
    }


}

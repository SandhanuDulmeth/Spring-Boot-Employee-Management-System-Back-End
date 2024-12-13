package edu.icet.service;

import edu.icet.dto.Student;
import edu.icet.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@Primary
public class StudnetServiceImpl implements StudentService {
    @Autowired
    StudentRepository repository;

    @Override
    public List<Student> getStudent() {
        return repository.findAll();
    }

    @Override
    public void addStudent(Student student) {
        repository.save(student);
    }

    @Override
    public void deleteStundetById(Integer id) {
        repository.deleteById(id);
    }
}

package edu.icet.service.impl;

import edu.icet.dto.Student;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
public class StudnetServiceImpl implements StudentService {
    @Autowired
    StudentRepository repository;
    @Override
    public List<Student> getStudent() {
        ArrayList<Student> stdList = new ArrayList<>();
        stdList.add(new Student(1,"kamal","gampaha"));
        stdList.add(new Student(2,"Saman","mahava"));

        return stdList;
    }
}

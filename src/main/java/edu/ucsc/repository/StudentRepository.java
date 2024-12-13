package edu.ucsc.repository;

import edu.ucsc.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer > {
}

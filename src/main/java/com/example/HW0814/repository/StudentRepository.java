package com.example.HW0814.repository;

import com.example.HW0814.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface StudentRepository  extends JpaRepository<Student, Long> {

    Collection<Student> findByAgeBetween(Integer min, Integer max);
}

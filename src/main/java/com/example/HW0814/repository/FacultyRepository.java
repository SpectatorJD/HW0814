package com.example.HW0814.repository;

import com.example.HW0814.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    Faculty findByName (String name);
    Collection<Faculty> findAllByColor(String color);

    Collection<Faculty> findAllByNameContains(String part);
}

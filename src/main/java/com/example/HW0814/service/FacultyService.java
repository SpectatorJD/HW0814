package com.example.HW0814.service;

import com.example.HW0814.model.Faculty;

import java.util.Collection;

public interface FacultyService {
    Faculty addFaculty (Faculty faculty);
    Faculty findFaculty (long id);
    Faculty editFaculty (long id, Faculty faculty);
    void deleteFaculty (long id);

    Collection<Faculty> getFilterByColor(String color);
    Faculty getFacultyById (Long id);


    Faculty editFaculty(Long id, Faculty faculty);
}

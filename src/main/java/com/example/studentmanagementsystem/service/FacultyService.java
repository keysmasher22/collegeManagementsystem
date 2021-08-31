package com.example.studentmanagementsystem.service;


import java.util.List;

import com.example.studentmanagementsystem.entity.Faculty;

public interface FacultyService {
	List<Faculty> getAllFacultys();
	Faculty saveFaculty(Faculty faculty);

}

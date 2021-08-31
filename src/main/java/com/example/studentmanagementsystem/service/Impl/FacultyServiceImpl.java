package com.example.studentmanagementsystem.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.studentmanagementsystem.entity.Faculty;
import com.example.studentmanagementsystem.repository.FacultyRepository;
import com.example.studentmanagementsystem.service.FacultyService;

@Service
public class FacultyServiceImpl implements FacultyService{
	private FacultyRepository facultyRepository;
	

	public FacultyServiceImpl(FacultyRepository facultyRepository) {
		super();
		this.facultyRepository = facultyRepository;
	}


	@Override
	public List<Faculty> getAllFacultys() {
		return facultyRepository.findAll();
	}


	@Override
	public Faculty saveFaculty(Faculty faculty) {
		return facultyRepository.save(faculty);
	}

}

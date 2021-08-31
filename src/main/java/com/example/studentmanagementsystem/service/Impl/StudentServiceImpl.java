package com.example.studentmanagementsystem.service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.studentmanagementsystem.entity.Student;
import com.example.studentmanagementsystem.repository.StudentRepository;
import com.example.studentmanagementsystem.service.*;



@Service  
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;
	

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	


	@Override
	public List<Student> getAllStudents() {
		
		
		return studentRepository.findAll();
		
	}
	@Override
	public Student updateStudent(Student student) {
	return studentRepository.save(student);
	}

	 @Override
	public Student getStudentById(Long id) {
	return studentRepository.findById(id).get();
	}


	 @Override
	public void deleteStudentById(Long id) {
	studentRepository.deleteById(id);
	}
	


	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}
	

}

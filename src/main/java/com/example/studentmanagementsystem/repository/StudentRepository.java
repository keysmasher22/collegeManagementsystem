package com.example.studentmanagementsystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.studentmanagementsystem.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> /*,CrudRepository<Student, Long>*/{
	Student findByName(String name);
	

} 


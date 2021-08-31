package com.example.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentmanagementsystem.entity.Faculty;


public interface FacultyRepository extends JpaRepository<Faculty, Long> {

}

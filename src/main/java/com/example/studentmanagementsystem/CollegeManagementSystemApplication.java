package com.example.studentmanagementsystem;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.studentmanagementsystem.repository.FacultyRepository;
import com.example.studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
public class CollegeManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CollegeManagementSystemApplication.class, args);
		
		  
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private FacultyRepository facultyRepository;

	@Override
	public void run(String... args) throws Exception {
		
		
	}

}

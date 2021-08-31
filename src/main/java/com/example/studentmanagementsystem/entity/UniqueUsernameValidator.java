package com.example.studentmanagementsystem.entity;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.studentmanagementsystem.repository.StudentRepository;

public class UniqueUsernameValidator implements ConstraintValidator <UniqueUsername, String> {
@Autowired
private StudentRepository studentRepository;

 @Override
public void initialize(UniqueUsername constraintAnnotation) {
}
@Override
public boolean isValid(String username, ConstraintValidatorContext context) {
if(studentRepository == null) {
return true;
}
return studentRepository.findByName(username) == null;
}


}
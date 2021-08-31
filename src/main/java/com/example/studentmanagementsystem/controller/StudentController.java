package com.example.studentmanagementsystem.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.studentmanagementsystem.CollegeManagementSystemApplication;
import com.example.studentmanagementsystem.entity.College;
import com.example.studentmanagementsystem.entity.Student;
import com.example.studentmanagementsystem.service.StudentService;




@Controller
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
//	Logger logger=LoggerFactory.getLogger(StudentController.class);
//	@GetMapping("/")
//	public String home() {
//		logger.error("incorrect url");
//		return "url";
//	}
	
	@GetMapping("/college")
	public String collegePage(Model model) { 		
		College college=new College();
		model.addAttribute("name", college.Time());
		
    	return "college";
    }
	@GetMapping("/college/details")
	public String collegeDetails(Model model) 
	
	//model retrives the data
	{    	
    	return "collegedetails";
    }
	  
	@GetMapping("/college/details/students")  
	public String listStudents(Model model) {
	model.addAttribute("students", studentService.getAllStudents());
	//add to database through student html
	return "students";
		
	}
    @GetMapping("/college/studentregisterform")       
	public String createStudentForm(@Valid Model model) {
    	Student student=new Student();
    	model.addAttribute("student",student);
    	return "create_student";
    }
    
    @PostMapping("/college/details/students")
    public String saveStudent(@Valid @ModelAttribute("student") Student student)
    {
    	studentService.saveStudent(student);    	
    	return "redirect:/college/details/students";
    	
    }
    @GetMapping("/college/details/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model)
    {
    model.addAttribute("student", studentService.getStudentById(id));
    return "edit_student";
    }
    
    @GetMapping("/college/details/students/{id}")
    public String listStudent(@PathVariable Long id,
    @ModelAttribute("student") Student student,Model model) {
    model.addAttribute("students", studentService.getStudentById(id));   
    return "getById";
    }
    
    @PostMapping("/college/details/students/{id}")
    public String updateStudent(@PathVariable Long id,
    @ModelAttribute("student") Student student, Model model)
    
    {
    Student existingStudent=studentService.getStudentById(id);
    existingStudent.setId(id);
    //existingStudent.setId(student.getId());
    existingStudent.setName(student.getName());
    existingStudent.setAddress(student.getAddress());
    existingStudent.setWeight(student.getWeight());
    studentService.updateStudent(existingStudent);
    return "redirect:/college/details/students";
    }
    
    @GetMapping("/college/details/students/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
    studentService.deleteStudentById(id);
    return "redirect:/college/details/students";
    }
    
}

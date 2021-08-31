package com.example.studentmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.studentmanagementsystem.entity.Faculty;
import com.example.studentmanagementsystem.service.FacultyService;


@Controller
public class FacultyController {
	private FacultyService facultyService;

	public FacultyController(FacultyService facultyService) {
		super();
		this.facultyService = facultyService;
	}
	
	@GetMapping("/college/details/facultys")    
	public String listFaculty(Model model)
	{
		model.addAttribute("facultys",facultyService.getAllFacultys());
		return "facultys";
	}
	@GetMapping("/college/facultyregisterform")
	public String createFacultyForm(Model model) {
    	Faculty faculty=new Faculty();
    	model.addAttribute("Faculty",faculty);
    	return "create_faculty";
    }
    
    @PostMapping("/college/details/facultys")
    public String saveFaculty(@ModelAttribute("faculty") Faculty faculty)
    {
    	facultyService.saveFaculty(faculty);
    	
    	return "redirect:/college/details/facultys";
    	
    }
	

}

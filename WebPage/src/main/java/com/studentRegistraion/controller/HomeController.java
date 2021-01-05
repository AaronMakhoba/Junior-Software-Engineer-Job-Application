package com.studentRegistraion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.studentRegistraion.model.StudentRegistraion;
import com.studentRegistraion.repository.StudentRepo;

@Controller
public class HomeController {
	
	@Autowired
	StudentRepo studentRepo;
	
	@RequestMapping("/addStudent")
	public String home(StudentRegistraion studentRegistraion) {
		studentRepo.save(studentRegistraion);
		return "home.jsp";
	}

}

package com.greatlearning.javafsd.studentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.javafsd.studentmanagement.entity.Student;
import com.greatlearning.javafsd.studentmanagement.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentsController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/list")
	public String handleListStudents(Model themodel) {
		List<Student> students = studentService.listAll();
		themodel.addAttribute("students", students);
		return "students-lister";
	}

}

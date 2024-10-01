package com.sourabh.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sourabh.sms.entity.Student;
import com.sourabh.sms.service.StudentService;

@Controller
public class StrudentController {
	
	private StudentService studentService;

	public StrudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	
	@GetMapping("students/new")
	public String createStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "student_form";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
		
		
	}

}

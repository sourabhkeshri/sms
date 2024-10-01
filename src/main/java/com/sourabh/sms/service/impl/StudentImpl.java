package com.sourabh.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sourabh.sms.entity.Student;
import com.sourabh.sms.repository.StudentRepository;
import com.sourabh.sms.service.StudentService;

@Service
public class StudentImpl implements StudentService{

	private StudentRepository studentRepository; 
	
	public StudentImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

}

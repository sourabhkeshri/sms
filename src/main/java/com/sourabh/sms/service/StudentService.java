package com.sourabh.sms.service;

import java.util.List;

import com.sourabh.sms.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);

}

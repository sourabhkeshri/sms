package com.sourabh.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sourabh.sms.entity.Student;
import com.sourabh.sms.repository.StudentRepository;

@SpringBootApplication
public class KeshriSchoolApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(KeshriSchoolApplication.class, args);
	}

	@Autowired
	StudentRepository studentRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student s1 = new Student("Sourabh", "Keshri", "Sourabh@example.com");
		 * studentRepository.save(s1);
		 * 
		 * Student s2 = new Student("Alice", "Smith", "alice.smith@example.com");
		 * studentRepository.save(s2);
		 * 
		 * Student s3 = new Student("Bob", "Johnson", "bob.johnson@example.com");
		 * studentRepository.save(s3);
		 * 
		 * Student s4 = new Student("Emma", "Williams", "emma.williams@example.com");
		 * studentRepository.save(s4);
		 * 
		 * Student s5 = new Student("Liam", "Brown", "liam.brown@example.com");
		 * studentRepository.save(s5);
		 */

	}

}

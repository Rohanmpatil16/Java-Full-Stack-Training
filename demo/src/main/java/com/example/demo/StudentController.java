package com.example.demo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Student getStudent() {
	    return new Student(1, "Vivek", "B-Tech");
	}

	@GetMapping("/students")
	public List<Student> getAllStudent() {
	    List<Student> list = new ArrayList<>();

	    list.add(new Student(1, "Vivek", "BSC"));
	    list.add(new Student(2, "Rohan", "MBA"));
	    list.add(new Student(3, "Aman", "MCA"));

	    return list;
	}
	}
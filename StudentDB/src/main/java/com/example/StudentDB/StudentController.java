package com.example.StudentDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/s")
public class StudentController {
	
	@Autowired
	StudentRepository repo;
	
	@GetMapping
	
	public List<Student> getAll()
	{
		return repo.findAll();
	}
	
	//get id
	@GetMapping("/{id}")
	public Student getByID(@PathVariable int id) {
	    return repo.findById(id).orElse(null);
	}
	
	//add student
	@PostMapping
	public Student addStudent(@RequestBody Student s) {
		return repo.save(s);
	}
	
	
	//update student
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable int id,
	                             @RequestBody Student s) {
	    s.setId(id);
	    return repo.save(s);
	}
	
	
	//delete the student
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		repo.deleteById(id);
		return "Student Deleted ID :"+id;
	}
}

package com.example.demo;

public class Student {

	 

	    private int id;
	    private String name;
	    private String course;

	    // Default Constructor
	    

	    // Parameterized Constructor
	    public Student(int id, String name, String course) {
	        this.id = id;
	        this.name = name;
	        this.course = course;
	    }

	    // Getters
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getCourse() {
	        return course;
	    }

	    // Setters
	    public void setId(int id) {
	        this.id = id;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setCourse(String course) {
	        this.course = course;
	    }
	}


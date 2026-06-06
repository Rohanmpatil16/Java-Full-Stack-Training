package com.example.postman;

public class post {
	

	    private int id;
	    private String title;
	    private double price;
	    private String author;
	    
	    public post() {}

	    
	    public post(int id, String title, double price, String author) {
	        this.author = author;
	        this.id = id;
	        this.price = price;
	        this.title = title;
	    }

	   
	    public int getId() {
	        return id;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public String getAuthor() {
	        return author;
	    }
	    
	    public void setId(int id) {
	        this.id = id;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }
	

}

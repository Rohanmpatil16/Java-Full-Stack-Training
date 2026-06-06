package com.example.postman;

import java.util.Arrays;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

import java.util.*;
@RestController
@RequestMapping("/")
public class postController {
	private List<post>boolList=new ArrayList<post>(Arrays.asList(
			 new post(1, "To Kill a Mockingbird", 500, "Jane Austen"),
	            new post(2, "savaljwadi express", 600, "Vivek Banda"),
	            new post(3, "Gadhinglaj cha king", 700, "Musandi KingMaker")
			));
	
	@GetMapping
	public List<post> getAllBooks(){
		 return boolList;
	}
	
	@GetMapping("{id}")
	public post getbookById(@PathVariable int id)
	{
		for(post b:boolList)
		{
			if(b.getId()==id)
			{
				return b;
			}
		}
		return null;
	}
	
	@PostMapping
	public String addBook(@RequestBody post book) {
	    boolList.add(book);
	    return "Book Added: " + book.getTitle();
	    }
	
	@PutMapping("{id}")
	public String updateBook(@PathVariable int id, @RequestBody post updatedBook) {

	    for (post b : boolList) {

	        if (b.getId() == id) {

	            b.setTitle(updatedBook.getTitle());
	            b.setPrice(updatedBook.getPrice());
	            b.setAuthor(updatedBook.getAuthor());

	            return "Book Updated Successfully";
	        }
	    }

	    return "Book Not Found";
	}
	    
	    @DeleteMapping("{id}")
	    public String deleteBook(@PathVariable int id)
	    {
	    	boolList.removeIf(b->b.getId()==id);
	    	return "Book deleted successfully wit id: "+id; 
	    }
	
	
	}


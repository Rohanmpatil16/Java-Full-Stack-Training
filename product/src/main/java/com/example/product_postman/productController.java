package com.example.product_postman;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")

public class productController {

	
	List<product>proList=new ArrayList<product>(Arrays.asList(
			new product(1,"spray","rp",20),
			new product(2,"perfume","vp",40),
			new product(3,"attar","am",30)
			));
	
	@GetMapping
	public List<product> getAllProducts() {
	    return proList;
	}
}

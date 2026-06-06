package com.example.product_postman;

public class product {

	
		private int id;
		private String title;
		private String author;
		private int price;
	
	
	public product() {
		
	}
	public product(int id,String title,String author,int price)
	{
		this.id=id;
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setTitle(String title)
	{
		this.title=title;
	}
	
	public void setAuthor(String author)
	{
		this.author=author;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	
}

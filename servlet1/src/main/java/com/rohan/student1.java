package com.rohan;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/student")
public class student1 extends HttpServlet
{
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		response.setContentType("Text/html");
		PrintWriter out=response.getWriter();
		out.println("<h2>Please Fill the form</h2>");
		
		response.setContentType("text/html");
		response.sendRedirect("index.html");
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		String name=request.getParameter("name");
		String course=request.getParameter("course");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<h2> Student Details :- </h2>");
		out.println("<p> Name : "+name+" </p>");
		out.println("<p> Course : "+course+"</p>");
	}
	
}
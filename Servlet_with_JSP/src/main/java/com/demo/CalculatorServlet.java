package com.demo;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/calculate")
public class CalculatorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        String operation = request.getParameter("operation");

        double result = 0;
        String operationName = "";

        if (operation.equals("add")) {
            result = num1 + num2;
            operationName = "Addition";
        } else if (operation.equals("subtract")) {
            result = num1 - num2;
            operationName = "Subtraction";
        } else if (operation.equals("multiply")) {
            result = num1 * num2;
            operationName = "Multiplication";
        } else if (operation.equals("divide")) {
            result = (double) num1 / num2;
            operationName = "Division";
        }

        request.setAttribute("result", result);
        request.setAttribute("operationName", operationName);
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}

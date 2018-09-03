package com.basics;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="Form",urlPatterns="/fir")
public class Form extends HttpServlet {
       
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String regNo=request.getParameter("regNum");
		String password=request.getParameter("password");
		String mobile=request.getParameter("phone");
		String mail=request.getParameter("mail");
		String qual[]=request.getParameterValues("qual");
		String skill[]=request.getParameterValues("skill");
		
		response.getWriter().println("Register number:"+regNo);
		response.getWriter().println("Password:"+password);
		response.getWriter().println("Mobile:"+mobile);
		response.getWriter().println("Mobile number:"+mail);
		response.getWriter().println("Qualification:");
		for(int i=0;i<qual.length;i++) {
			response.getWriter().println(qual[i]);
		}
		response.getWriter().println("Skills:");
		for(int i=0;i<skill.length;i++) {
			response.getWriter().println(skill[i]);
		}
		
	}

}

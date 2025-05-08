package com.anshu;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParentServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.println("What details you wanna see ?");
		String ans = req.getParameter("choice");
		
		if (ans.equals("name")) {
			String getName = "Udbhav";
			req.setAttribute("Name", getName);
			RequestDispatcher rsd = req.getRequestDispatcher("/name");
			rsd.forward(req, res);
		} else if (ans.equals("age")) {
			String getAge = "19";
			req.setAttribute("Age", getAge);
			RequestDispatcher rsd = req.getRequestDispatcher("/age");
			rsd.forward(req, res);
		} else if (ans.equals("email")) {
			String getEmail = "udbhavsbg@gmail.com";
			req.setAttribute("Email", getEmail);
			RequestDispatcher rsd = req.getRequestDispatcher("email");
			rsd.forward(req, res);
		} else {
			out.println("Invalid choice. Try 'name', 'age', or 'email'.");
		}
	}
}


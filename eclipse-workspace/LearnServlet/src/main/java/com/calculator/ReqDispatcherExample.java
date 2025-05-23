package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReqDispatcherExample extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
//		PrintWriter out= res.getWriter();
//		out.println("ReqDispatcher called");
		String name = req.getParameter("reqDis");
		
		RequestDispatcher rd= req.getRequestDispatcher("printDispatcher");
		req.setAttribute("Name", name);
		rd.forward(req, res);
		
	}

}

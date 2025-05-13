package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendRedirect extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		PrintWriter out= res.getWriter();
		
		int a= Integer.parseInt(req.getParameter("num1"));
		int b= Integer.parseInt(req.getParameter("num2"));
		
		res.sendRedirect("sq?a=" + a + "&b=" + b);  //URL Rewriting because we are passing value on URL Format

	}

}

package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetResponseOfSendRedirect extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out= res.getWriter();
		
		int parameter1=Integer.parseInt(req.getParameter("a"));
		int parameter2=Integer.parseInt(req.getParameter("b"));
		
		long ans=(int)Math.pow(parameter1, parameter2);
		
		out.println("Ans:"+ans);

	}

}

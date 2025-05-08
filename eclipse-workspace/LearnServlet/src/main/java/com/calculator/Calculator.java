package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class Calculator extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
		int k=Integer.parseInt(req.getParameter("num1"));
		int l=Integer.parseInt(req.getParameter("num2"));
		PrintWriter out = res.getWriter();
		String symbol = req.getParameter("symbol");
		
		if(symbol.equals("+")) {
			out.println("Result:"+(k+l));
		}
		
		else if(symbol.equals("-")) {
			out.println("Result:"+(k-l));
		}
		
		else if(symbol.equals("*")) {
			out.println("Result:"+(k*l));
		}
		
		else if(symbol.equals("/")) {
			out.println("Result:"+(k/l));
		}
		
		else if(symbol.equals("%")) {
			out.println("Result:"+(k%l));
		}
		
		else {
			out.println("Something went wrong");
		}
		
	}
	
	public long squareOfNum(int x) {
		return x*x;
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		int num=Integer.parseInt(req.getParameter("squareNum"));
		PrintWriter out = res.getWriter();
		out.println("Ans:"+squareOfNum(num));
	}
	

}

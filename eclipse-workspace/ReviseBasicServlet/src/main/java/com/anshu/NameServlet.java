package com.anshu;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NameServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
		
		PrintWriter out = res.getWriter();
		
		String printName=(String)req.getAttribute("Name");
		out.println("Your Name:"+printName);
	}
}

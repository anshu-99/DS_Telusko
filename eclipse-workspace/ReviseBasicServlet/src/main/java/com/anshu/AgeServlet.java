package com.anshu;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeServlet extends HttpServlet {
		public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
			
			PrintWriter out = res.getWriter();
			
			String printAge=(String)req.getAttribute("Age");
			out.println("Your Name:"+printAge);
		}
	}

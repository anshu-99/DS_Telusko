package com.anshu;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmailServlet extends HttpServlet {
		public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
			
			PrintWriter out = res.getWriter();
			
			String printEmail=(String)req.getAttribute("Email");
			out.println("Your Name:"+printEmail);
		}
	}

package com.Firsttry.servlet.ip;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");//selected content type
		
		PrintWriter out=res.getWriter();
		out.println("<h1>Hellooooooooooiio</h1>");
	}

}

package com.shimh.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String p = req.getParameter("");
		
		PrintWriter out = resp.getWriter();
		ServletOutputStream stream = resp.getOutputStream();
		
		//输出html到客户端
		out.println("<html></html>");
		
		//返回jsp视图
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		
	}
	
	
	
}

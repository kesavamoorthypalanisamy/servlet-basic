package com.hippo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{
	LoginService loginService = new LoginService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		/*
		 * PrintWriter out = response.getWriter(); out.println("hello world!!!");
		 */
		request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name = request.getParameter("name");
		request.setAttribute("name", name);
		String password = request.getParameter("password");
		if(loginService.doValidate(name, password)) {
			request.setAttribute("password", password);
			request.getRequestDispatcher("WEB-INF/views/welcome.jsp").forward(request, response);
		}else {
			request.setAttribute("errorMessage", "invalid username/password");
			request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
		}
		
	}
}

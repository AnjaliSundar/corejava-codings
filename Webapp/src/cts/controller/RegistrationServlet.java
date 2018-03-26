package cts.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cts.model.EmployeeService;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 3 parameters from html form i, n and s
		int id = Integer.parseInt(request.getParameter("i"));
		String name = request.getParameter("n");
		double salary = Double.parseDouble(request.getParameter("s"));
		EmployeeService service = new EmployeeService(); 
		int status = service.insert(id, name, salary);
		if(status == 1) {
			// Request dispatcher forwards to login.html
			RequestDispatcher rd = request.getRequestDispatcher("success.html");
			rd.forward(request, response);
		} else {
			// Request dispatcher forwards to failure.html
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.forward(request, response);
		}
	
	}
}


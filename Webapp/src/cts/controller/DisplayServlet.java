package cts.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cts.model.Employee;
import cts.model.EmployeeService;

/**
 * Servlet implementation class DisplayServlet
 */
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeService service = new EmployeeService();
		List list = service.displayAll();
		/*PrintWriter out = response.getWriter();
		out.println("<html><body>");
		for(Object obj : list) {
			Employee emp = (Employee)obj;
			out.println("<p>");
			out.print("Id = "+emp.getId()+", Name = "+emp.getName()+", Salary = "+emp.getSalary());
			out.println("</p>");
			out.print("<hr>");
		}
	
		out.println("</body></html>");*/
		request.setAttribute("allEmps", list);
		RequestDispatcher rd = request.getRequestDispatcher("employees.jsp");
				rd.forward(request, response);
	}

}

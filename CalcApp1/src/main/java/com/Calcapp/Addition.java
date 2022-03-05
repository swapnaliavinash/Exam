package com.Calcapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Addition
 */
@WebServlet("/add")
public class Addition extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addition() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	


		int a = Integer.parseInt(request.getParameter("fNum"));
		int b = Integer.parseInt(request.getParameter("sNum"));
		String oper = request.getParameter("b1");
		PrintWriter out = response.getWriter();
		out.print("<Html><body><font color='red'><h1>Addition Operation & your input 1 number:" + a + "<br> 2 number: "
				+ b);
		
		int result = 0;
		if (oper.equals("Addition")) {
			out.print("<br>Result:" + (a + b));
		} else if (oper.equals("Substract"))
			out.print("<br>Result:" + (a - b));
		else if (oper.equals("Divid"))
			out.print("<br>Result:" + (a / b));
		else if (oper.equals("Multi"))
			out.print("<br>Result:" + (a * b));

		out.print("</h1><a href='index.html'>back</a></body></html>");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.builds.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.builds.uimaps.BrowserTest;


/**
 * Servlet implementation class BrowserServlets
 */
public class BrowserServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BrowserServlets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String operatingSystem=request.getParameter("operatingSystem");
		String browserName=request.getParameter("browserName");
		String ipAddress=request.getParameter("ipAddress");
		
		System.out.println("BrowserServlets operatingSystem : "+operatingSystem);
		System.out.println("BrowserServlets browserName : " +browserName);
		System.out.println("BrowserServlets ipAddress : "+ipAddress);
		
		
		
		BrowserTest browserTestObj=new BrowserTest();
		browserTestObj.browserSelection(operatingSystem,browserName,ipAddress);
		
		response.sendRedirect("confirmation.jsp");
			
	}

}

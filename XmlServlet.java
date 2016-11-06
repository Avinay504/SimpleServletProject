package org.kouishik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/XmlServlet")
public class XmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public XmlServlet() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    PrintWriter out=response.getWriter();
	    String username=request.getParameter("username");
	    out.println("Hello from get Method!," + username);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    PrintWriter out=response.getWriter();
	    String username=request.getParameter("username");
	    String fullname=request.getParameter("fullname");
	    out.println("Hello! from the Post Method" + username +"!we know your full name is" + fullname);
	    String prof=request.getParameter("prof");
	    out.println("you are a" +prof);
	    //String location=request.getParameter("location");
	    String[] location=request.getParameterValues("location");
	    out.println("you are at" +location.length  + "places");
	    for(int i=0;i<location.length;i++){
	    	out.println(location[i]);
	    }
		
	}
}

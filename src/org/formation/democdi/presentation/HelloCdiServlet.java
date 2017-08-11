package org.formation.democdi.presentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.formation.democdi.service.ClientService;

@WebServlet(urlPatterns="/hellocdi")
public class HelloCdiServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Inject
	ClientService service;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		service.creerClient();
		
		PrintWriter out = response.getWriter();
		out.println("Mise en oeuvre CDI Ok");
		out.close();
	}
}


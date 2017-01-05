/**
 * Copyright 2017 Kofera Technology Inc. All Rights Reserved.
 */
package com.kofera.app.web.controllers.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.googlecode.objectify.ObjectifyService;
import com.kofera.app.web.entities.KoferaAccount;
import com.kofera.app.web.entities.KoferaAccountRole;
import com.kofera.app.web.entities.KoferaRole;

/**
 * This servlet for testing entity kofera account role
 * 
 * @author zulfikar@kofera.com
 * @version 1.0
 */
public class KoferaAccountRoleTestServlet extends HttpServlet {

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html><head><title>kofera account role</title></head><body>");
		
		// prepare kofera account 
		KoferaAccount account = new KoferaAccount("zulfikar@kofera.com", "mantap", "Zulfikar", "Idris");
		ObjectifyService.ofy().save().entity(account).now(); // async without the now()
		
		out.println("<h3>Kofera Account</h3>");
		out.println("<p>" + account.toString() + "</p>");
		
		// prepare kofera role
		KoferaRole role = new KoferaRole(1L, "owner");
	    ObjectifyService.ofy().save().entity(role).now(); // async without the now()
		
	    out.println("<h3>Kofera Role</h3>");
		out.println("<p>" + role.toString() + "</p>");
		
		KoferaAccountRole accountRole = new KoferaAccountRole(account.getKey(), role.getKey());
		ObjectifyService.ofy().save().entity(accountRole).now(); // async without the now()
		out.println("<h3>Kofera Account Role</h3>");
		out.println("<p>" + accountRole.toString() + "</p>");
		out.println("</body></html>");
	}
	
	
}

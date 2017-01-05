/**
 * Copyright 2017 Kofera Technology Inc. All Rights Reserved.
 */
package com.kofera.app.web.controllers.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Result;
import com.kofera.app.web.entities.KoferaAccount;
import com.kofera.app.web.entities.KoferaAccountRole;
import com.kofera.app.web.entities.KoferaAccountService;
import com.kofera.app.web.entities.KoferaService;
import com.kofera.app.web.entities.KoferaAccountService;

/**
 * This servlet for testing entity kofera account service
 * 
 * @author agung@wirehub.co.id
 * @version 1.0
 */
public class KoferaAccountServiceTestServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html><head><title>kofera account service</title></head><body>");

		// prepare kofera account
		KoferaAccount account = new KoferaAccount("agung@wirehub.co.id", "rikawatanabe", "Agung", "Nurdiyanto");
		ObjectifyService.ofy().save().entity(account).now(); // async without the now()

		out.println("<h3>Kofera Account</h3>");
		out.println("<p>" + account.toString() + "</p>");

		KoferaService service = new KoferaService("e-commerce");
		ObjectifyService.ofy().save().entity(service).now(); // async without the now()
		out.println("<h3>Kofera Service</h3>");
		out.println("<p>" + service.toString() + "</p>");

		KoferaAccountService accountService = new KoferaAccountService(account.getKey(), service.getKey());
		ObjectifyService.ofy().save().entity(accountService).now(); // async without the now()
		out.println("<h3>Kofera Account Role</h3>");
		out.println("<p>" + accountService.toString() + "</p>");
		out.println("</body></html>");
	}
}

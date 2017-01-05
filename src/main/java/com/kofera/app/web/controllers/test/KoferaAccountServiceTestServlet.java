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
import com.kofera.app.web.entities.KoferaAccountService;
import com.kofera.app.web.entities.KoferaAccountService;

public class KoferaAccountServiceTestServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();
		out.println("test for Entity koferaAccountService");

		KoferaAccountService accountService = new KoferaAccountService(10000L, 30000L);
		// save
		ObjectifyService.ofy().save().entity(accountService).now(); // async without
																// the now()

		if (accountService.getId() != null) {
			out.println("kofera account service has saved:");
			out.println(accountService.toString());
		}

		// Get it back
		Result<KoferaAccountService> result = ObjectifyService.ofy().load()
				.key(Key.create(KoferaAccountService.class, accountService.getId())); // Result
																		// is
																		// async
		KoferaAccountService fetched1 = result.now(); // Materialize the async value

		if (fetched1 != null) {
			out.println("<p>get it back:<br/>");
			out.println(accountService.toString());
		}
	}
}

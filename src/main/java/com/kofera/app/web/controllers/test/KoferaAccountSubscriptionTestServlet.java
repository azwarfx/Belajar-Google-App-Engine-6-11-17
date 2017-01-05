package com.kofera.app.web.controllers.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Result;
import com.kofera.app.web.entities.KoferaAccountSubscription;

public class KoferaAccountSubscriptionTestServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();
		out.println("test for Entity KoferaAccountSubscription");
		
		KoferaAccountSubscription accountSubscription = new KoferaAccountSubscription(12345L, 67890, 13579);
		// save
		ObjectifyService.ofy().save().entity(accountSubscription).now(); 
		
		if (accountSubscription.getKoferaId() != null) {
			out.println("kofera account subscription has been saved");
			out.println(accountSubscription.toString());
		}
		
		// get it back
		Result<KoferaAccountSubscription> result = ObjectifyService.ofy().load()
				.key(Key.create(KoferaAccountSubscription.class, accountSubscription.getId())); // Result
		
		KoferaAccountSubscription fetched1 = result.now(); // Materialize the async value
		
		if (fetched1 != null) {
			out.println("<p>get it back:<br/>");
			out.print(accountSubscription.toString());
		}
	}
}

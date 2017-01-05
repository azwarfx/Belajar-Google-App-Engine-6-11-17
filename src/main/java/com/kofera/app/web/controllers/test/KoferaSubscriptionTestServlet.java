package com.kofera.app.web.controllers.test;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Result;
import com.kofera.app.web.entities.KoferaSubscription;

public class KoferaSubscriptionTestServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();
		out.println("test for Entity kofera subscription");
		
		KoferaSubscription subscription = new KoferaSubscription("Free");
		// save
		ObjectifyService.ofy().save().entity(subscription).now();
		
		if (subscription.getId() != null) {
			out.println("kofera subscription has been saved");
			out.println(subscription.toString());
		}
		
		// get it back
		Result<KoferaSubscription> result = ObjectifyService.ofy().load()
				.key(Key.create(KoferaSubscription.class, subscription.getId()));
		KoferaSubscription fetched1 = result.now();
		
		if (fetched1 != null) {
			out.println("<p>get it back:<br/>");
			out.println(subscription.toString());
		}
	}
}

/**
 * Copyright 2017 Kofera Technology Inc. All Rights Reserved.
 */
package com.kofera.app.web.controllers.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.googlecode.objectify.ObjectifyService;
import com.kofera.app.web.entities.KoferaAccountPayment;
import com.kofera.app.web.entities.KoferaAccountSubscription;
import com.kofera.app.web.entities.KoferaPayment;

/**
 * This servlet for testing entity kofera account payment and payment
 * 
 * @author agung@wirehub.co.id
 * @version 1.0
 */
public class KoferaAccountPaymentTestServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html><head><title>kofera account payment</title></head><body>");

		// prepare kofera account
		KoferaAccountSubscription accountSubscription = 
				new KoferaAccountSubscription(4648L, 1231, 1000);
		ObjectifyService.ofy().save().entity(accountSubscription).now(); // async without the now()

		out.println("<h3>Kofera Account Subscription</h3>");
		out.println("<p>" + accountSubscription.toString() + "</p>");

		KoferaPayment payment = new KoferaPayment(46L, "paypal", "{\"test\":\"test\"}");
		ObjectifyService.ofy().save().entity(payment).now(); // async without the now()
		out.println("<h3>Kofera Payment</h3>");
		out.println("<p>" + payment.toString() + "</p>");

		KoferaAccountPayment accountPayment = 
				new KoferaAccountPayment(accountSubscription.getKoferaId(), 
						payment.getKey(), "information");
		ObjectifyService.ofy().save().entity(accountPayment).now(); // async without the now()
		out.println("<h3>Kofera Account Role</h3>");
		out.println("<p>" + accountPayment.toString() + "</p>");
		out.println("</body></html>");
	}
}

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
import com.kofera.app.web.entities.KoferaService;

/**
 * This servlet for testing entity kofera service
 * 
 * @author agung@wirehub.co.id
 * @version 1.0
 */
public class KoferaServiceTestServlet extends HttpServlet{
	  
	@Override
	  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		  resp.setContentType("text/plain");
		  PrintWriter out = resp.getWriter();
		  out.println("test for Entity koferaService");
		  
		  KoferaService service = new KoferaService("e-commerce");
		  // save 
		  ObjectifyService.ofy().save().entity(service).now(); // async without the now()
		  
		  if (service.getId() != null) {
			  out.println("kofera service has saved:");
			  out.println(service.toString());
		  }
		  
		// Get it back
		  Result<KoferaService> result = ObjectifyService.ofy().load().key(Key.create(KoferaService.class, service.getId()));  // Result is async
		  KoferaService fetched1 = result.now();    // Materialize the async value
		  
		  if (fetched1 != null) {
			  out.println("<p>get it back:<br/>");
			  out.println(service.toString());
		  }
	  }
}

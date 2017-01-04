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

/**
 * This servlet just for testing entity koferaACcount
 * @author zulfikar@kofera.com
 * @version 1.0
 */
public class KoferaAccountTestServlet extends HttpServlet {
	
	  @Override
	  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		  resp.setContentType("text/plain");
		  PrintWriter out = resp.getWriter();
		  out.println("test for Entity koferaAccount");
		  
		  KoferaAccount account = new KoferaAccount("zulfikar@kofera.com", "mantap", "Zulfikar", "Idris");
		  
		  // save 
		  ObjectifyService.ofy().save().entity(account).now(); // async without the now()
		  
		  if (account.getId() != null) {
			  out.println("account has saved:<br/>");
			  out.println(account.toString());
		  }
		  
		// Get it back
		  Result<KoferaAccount> result = ObjectifyService.ofy().load().key(Key.create(KoferaAccount.class, account.getId()));  // Result is async
		  KoferaAccount fetched1 = result.now();    // Materialize the async value
		  
		  if (fetched1 != null) {
			  out.println("<p>get it back:<br/>");
			  out.println(account.toString());
		  }
	  }
}

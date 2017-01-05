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
import com.kofera.app.web.entities.KoferaRole;

/**
 * This servlet for testing entity kofera role
 * 
 * @author zulfikar@kofera.com
 * @version 1.0
 */
public class KoferaRoleTestServlet extends HttpServlet {
	  @Override
	  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		  resp.setContentType("text/plain");
		  PrintWriter out = resp.getWriter();
		  out.println("test for Entity koferaAccount");
		  
		  KoferaRole role = new KoferaRole("manager");
		  // save 
		  ObjectifyService.ofy().save().entity(role).now(); // async without the now()
		  
		  if (role.getId() != null) {
			  out.println("kofera role has saved:");
			  out.println(role.toString());
		  }
		  
		// Get it back
		  Result<KoferaRole> result = ObjectifyService.ofy().load().key(Key.create(KoferaRole.class, role.getId()));  // Result is async
		  KoferaRole fetched1 = result.now();    // Materialize the async value
		  
		  if (fetched1 != null) {
			  out.println("get it back:");
				  out.println(role.toString());
		  }
	 }
}

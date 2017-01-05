/**
 * Copyright 2017 Kofera Technology Inc. All Rights Reserved.
 */
package com.kofera.app.web.controllers.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Result;
import com.kofera.app.web.entities.KoferaAuthFacebook;

/**
 * 
 * This class for testing kofera auth facebook entity
 * @author zakaria@kofera.com
 * @version 1.0
 */
public class KoferaAuthFacebookTestServlet extends HttpServlet{

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();
		out.println("Test for Entity KoferaAuthFacebook");
		
		KoferaAuthFacebook authFacebook = new KoferaAuthFacebook(10000L, 20000L, "examplerefreshtoken", "exampleaccesstoken", new Date());
		//to save
		ObjectifyService.ofy().save().entity(authFacebook).now();
		
		if(authFacebook.getAccountId()!= null){
			out.println("facebook account has saved");
			out.println(authFacebook.toString());
		}
		
		//Get it back
		Result<KoferaAuthFacebook> result = ObjectifyService.ofy().load().key(Key.create(KoferaAuthFacebook.class, authFacebook.getAccountId()));
		KoferaAuthFacebook fetched = result.now();
		
		if(fetched != null){
			out.println("<p>get it back:<br/>");
			out.println(authFacebook.toString());
		}
	}

}

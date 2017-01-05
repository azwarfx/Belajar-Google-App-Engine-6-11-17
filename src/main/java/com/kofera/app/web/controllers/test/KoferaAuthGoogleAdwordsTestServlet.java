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

import com.googlecode.objectify.Key;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Result;
import com.kofera.app.web.entities.KoferaAuthGoogleAdwords;
import com.kofera.app.web.entities.KoferaFeature;

/**
 * This class for testing entity KoferaAuthGoogleAdwords
 * 
 * @author fitri@kofera.com
 * @version 1.0
 *
 */

public class KoferaAuthGoogleAdwordsTestServlet extends HttpServlet {

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();
		out.println("test for @Entity KoferaAuthGoogleAdwords");

		KoferaAuthGoogleAdwords adwords = new KoferaAuthGoogleAdwords(1000L, "123ABC", "456ASD");
		// Save
		ObjectifyService.ofy().save().entity(adwords).now();

		if (adwords.getId() != null) {
			out.println("Kofera Adwords has saved");
			out.println(adwords.toString());
		}

		// Get it back
		Result<KoferaAuthGoogleAdwords> result = ObjectifyService.ofy().load()
				.key(Key.create(KoferaAuthGoogleAdwords.class, adwords.getId()));
		KoferaAuthGoogleAdwords fetched = result.now();

		if (fetched != null) {
			out.println("Get is back:");
			out.println(adwords.toString());
		}
	}
}

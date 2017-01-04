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
import com.kofera.app.web.entities.KoferaFeature;

/**
 * This class for testing entity KoferaFeature
 * @author zakaria@kofera.com
 * @version 1.0
 *
 */
public class KoferaFeatureTestServlet extends HttpServlet{

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();
		out.println("test for @Entity KoferaFeature");
		
		KoferaFeature feature = new KoferaFeature("Ecommerce Dashboard");
		//Save
		ObjectifyService.ofy().save().entity(feature).now();
		
		if(feature.getId() != null){
			out.println("Kofera Feature has saved");
			out.println(feature.toString());
		}
		
		//Get it back
		Result<KoferaFeature> result = ObjectifyService.ofy().load().key(Key.create(KoferaFeature.class, feature.getId()));
		KoferaFeature fetched = result.now();
		
		if(fetched!= null){
			out.println("Get is back:");
			out.println(feature.toString());
		}
	}

	
}

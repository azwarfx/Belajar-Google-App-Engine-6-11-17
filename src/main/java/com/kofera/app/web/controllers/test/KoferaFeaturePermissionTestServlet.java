/**
 * Copyright 2017 Kofera Technology Inc. All Rights Reserved.
 */
package com.kofera.app.web.controllers.test;
/*
 * @author azwar@kofera.com
 */

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
import com.kofera.app.web.entities.KoferaFeaturePermission;
import com.kofera.app.web.entities.KoferaFeaturePermission;

public class KoferaFeaturePermissionTestServlet extends HttpServlet{

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();
		out.println("test for @Entity KoferaFeaturePermission");
		
		KoferaFeaturePermission featurePermission = new KoferaFeaturePermission(1000L,1000L,1000L); //dumy nilai
		//Save
		ObjectifyService.ofy().save().entity(featurePermission).now();
		
		if(featurePermission.getId() != null){
			out.println("Kofera Feature Permission has saved");
			out.println(featurePermission.toString());
		}
		
		//Get it back
		Result<KoferaFeaturePermission> result = ObjectifyService.ofy().load().key(Key.create(KoferaFeaturePermission.class, featurePermission.getId()));
		KoferaFeaturePermission fetched = result.now();
		
		if(fetched!= null){
			out.println("Get is back:");
			out.println(featurePermission.toString());
		}
	}

	
}
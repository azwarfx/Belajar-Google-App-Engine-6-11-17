package com.kofera.app.web.controllers.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Result;
import com.kofera.app.web.entities.KoferaPackage;

public class KoferaPackageTestServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();
		out.println("test for Entity kofera package");
		
		KoferaPackage packages = new KoferaPackage("Standard", 99L, 15000L);
		// save
		ObjectifyService.ofy().save().entity(packages).now();
		
		if (packages.getId() != null) {
			out.println("kofera subscription has been saved");
			out.println(packages.toString());
		}
		
		// get it back
		Result<KoferaPackage> result = ObjectifyService.ofy().load()
				.key(Key.create(KoferaPackage.class, packages.getId()));
		KoferaPackage fetched1 = result.now();
		
		if (fetched1 != null) {
			out.println("<p>get it back:<br/>");
			out.println(packages.toString());
		}
	}
}

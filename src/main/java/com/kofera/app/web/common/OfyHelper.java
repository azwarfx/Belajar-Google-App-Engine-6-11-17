/**
 * Copyright 2014-2015 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//[START all]
package com.kofera.app.web.common;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.example.guestbook.Greeting;
import com.example.guestbook.Guestbook;
import com.googlecode.objectify.ObjectifyService;
import com.kofera.app.web.entities.KoferaAccount;
import com.kofera.app.web.entities.KoferaAccountPayment;
import com.kofera.app.web.entities.KoferaAuthGoogleAdwords;
import com.kofera.app.web.entities.KoferaAuthFacebook;
import com.kofera.app.web.entities.KoferaAccountRole;
import com.kofera.app.web.entities.KoferaAccountService;
import com.kofera.app.web.entities.KoferaAccountSubscription;
import com.kofera.app.web.entities.KoferaFeature;
import com.kofera.app.web.entities.KoferaFeaturePermission;
import com.kofera.app.web.entities.KoferaFeaturePermission;
import com.kofera.app.web.entities.KoferaPackage;
import com.kofera.app.web.entities.KoferaPayment;
import com.kofera.app.web.entities.KoferaRole;
import com.kofera.app.web.entities.KoferaService;
import com.kofera.app.web.entities.KoferaSubscription;

/**
 * OfyHelper, a ServletContextListener, is setup in web.xml to run before a JSP
 * is run. This is required to let JSP's access Ofy.
 **/
public class OfyHelper implements ServletContextListener {
	public void contextInitialized(ServletContextEvent event) {
	    // This will be invoked as part of a warmup request, or the first user request if no warmup
		// request.
	    ObjectifyService.register(Guestbook.class);
	    ObjectifyService.register(Greeting.class);
	    ObjectifyService.register(KoferaAccount.class);
	    ObjectifyService.register(KoferaRole.class);
	    ObjectifyService.register(KoferaAccountRole.class);
		ObjectifyService.register(KoferaFeature.class);
		ObjectifyService.register(KoferaService.class);
		ObjectifyService.register(KoferaAuthGoogleAdwords.class);
		ObjectifyService.register(KoferaAuthFacebook.class);
		ObjectifyService.register(KoferaPackage.class);
		ObjectifyService.register(KoferaSubscription.class);
<<<<<<< HEAD
		ObjectifyService.register(KoferaFeaturePermission.class); 
=======
		ObjectifyService.register(KoferaAccountSubscription.class);
		ObjectifyService.register(KoferaAccountService.class);
		ObjectifyService.register(KoferaPayment.class);
		ObjectifyService.register(KoferaAccountPayment.class);
>>>>>>> f2e0a2a30dc12b823c5c028df5014bf13688a8c3
	}

	public void contextDestroyed(ServletContextEvent event) {
		// App Engine does not currently invoke this method.
	}
}
// [END all]

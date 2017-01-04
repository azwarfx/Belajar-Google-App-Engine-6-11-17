/**
 * Copyright 2017 Kofera Technology Inc. All Rights Reserved.
 */
package com.kofera.app.web.entities;

import java.util.Date;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * This @Entity for kofera account
 * 
 * @author zulfikar@kofera.com
 * @version 1.0
 */
@Entity
public class KoferaAccount {
	@Id Long id;
	@Index String email;
	String password;
	Date createdAt;
	String activationToken;
	boolean activationStatus;
	Date activationAt;
	String resetPasswordToken;
	String firstName;
	String lastName;
	String company;
	String address;
	String city;
	String province;
	String country;
	String postalCode;
	String phone;

	 /**
	   * Simple constructor just sets the date
	   **/
	 public KoferaAccount() {
		 createdAt = new Date();
	 }
	 
	 /**
	  * A convenience constructor
	  */
	 public KoferaAccount(String email, String password) {
		 this();
		 this.email = email;
		 this.password = password;
	 }
	 
	 /**
	  * Takes all important fields
	  */
	 public KoferaAccount(String email, String password, String firstName, String lastName) {
		 this();
		 this.email = email;
		 this.password = password;
		 this.firstName = firstName;
		 this.lastName = lastName;
	 }
	  
}

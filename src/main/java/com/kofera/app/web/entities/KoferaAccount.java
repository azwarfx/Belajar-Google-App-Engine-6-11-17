/**
 * Copyright 2017 Kofera Technology Inc. All Rights Reserved.
 */
package com.kofera.app.web.entities;

import java.util.Date;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;

/**
 * This @Entity for kofera account
 * 
 * @author zulfikar@kofera.com
 * @version 1.0
 */
@Entity
public class KoferaAccount extends KoferaModel{
	@Index String email;
	String password;
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
	  * A convenience constructor
	  */
	 public KoferaAccount(String email, String password) {
		 super();
		 this.email = email;
		 this.password = password;
	 }
	 
	 /**
	  * Takes all important fields
	  */
	 public KoferaAccount(String email, String password, String firstName, String lastName) {
		 super();
		 this.email = email;
		 this.password = password;
		 this.firstName = firstName;
		 this.lastName = lastName;
	 }

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the activationToken
	 */
	public String getActivationToken() {
		return activationToken;
	}

	/**
	 * @param activationToken the activationToken to set
	 */
	public void setActivationToken(String activationToken) {
		this.activationToken = activationToken;
	}

	/**
	 * @return the activationStatus
	 */
	public boolean isActivationStatus() {
		return activationStatus;
	}

	/**
	 * @param activationStatus the activationStatus to set
	 */
	public void setActivationStatus(boolean activationStatus) {
		this.activationStatus = activationStatus;
	}

	/**
	 * @return the activationAt
	 */
	public Date getActivationAt() {
		return activationAt;
	}

	/**
	 * @param activationAt the activationAt to set
	 */
	public void setActivationAt(Date activationAt) {
		this.activationAt = activationAt;
	}

	/**
	 * @return the resetPasswordToken
	 */
	public String getResetPasswordToken() {
		return resetPasswordToken;
	}

	/**
	 * @param resetPasswordToken the resetPasswordToken to set
	 */
	public void setResetPasswordToken(String resetPasswordToken) {
		this.resetPasswordToken = resetPasswordToken;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{id: ").append(id).append(", email: ").append(email).append(", password: ").append(password)
				.append(", createdAt: ").append(createdAt).append(", activationToken: ").append(activationToken)
				.append(", activationStatus: ").append(activationStatus).append(", activationAt: ").append(activationAt)
				.append(", resetPasswordToken: ").append(resetPasswordToken).append(", firstName: ").append(firstName)
				.append(", lastName: ").append(lastName).append(", company: ").append(company).append(", address: ")
				.append(address).append(", city: ").append(city).append(", province: ").append(province)
				.append(", country: ").append(country).append(", postalCode: ").append(postalCode).append(", phone: ")
				.append(phone).append("}");
		return builder.toString();
	}
	 
	
}

/**
 * Copyright 2017 Kofera Technology Inc. All Rights Reserved.
 */
package com.kofera.app.web.entities;

import java.beans.Transient;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;

/**
 * This @Entity for kofera account service
 * 
 * @author agung@wirehub.co.id
 * @version 1.0
 */
@Entity
public class KoferaPayment extends KoferaModel{
	
	String name;
	String apiCredential;
	
	/**
	 * @param name
	 */
	public KoferaPayment(String name, String apiCredential) {
		super();
		this.name = name;
		this.apiCredential = apiCredential;
	}
	
	/**
	 * @param name, id
	 */
	public KoferaPayment(Long id, String name, String apiCredential) {
		super();
		this.id = id;
		this.name = name;
		this.apiCredential = apiCredential;
	}

	@Transient
	public Key<KoferaPayment> getKey(){
		return Key.create(KoferaPayment.class, id);
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * @return the apiCredential
	 */
	public String getApiCredential() {
		return apiCredential;
	}

	/**
	 * @param apiCredential the apiCredential to set
	 */
	public void setApiCredential(String apiCredential) {
		this.apiCredential = apiCredential;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{id: ").append(id)
		.append(", name: ").append(name)
		.append(", apiCredential: ").append(apiCredential)
		.append(", createdAt: ").append(createdAt)
		.append(", updateAt: ").append(updatedAt).append("}");
		return builder.toString();
	}
}

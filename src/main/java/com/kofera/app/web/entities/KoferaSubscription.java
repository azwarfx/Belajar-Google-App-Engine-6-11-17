/**
 * Copyright 2017 Kofera Technology Inc. All Rights Reserved.
 */
package com.kofera.app.web.entities;

import com.googlecode.objectify.annotation.Entity;

/**
 * 1. Free
 * 2. Trial
 * 3. Premium Self Service
 * 4. Premium Manage Service
 * 5. Premium Agency
 * 
 * This @Entity for kofera subscription
 * 
 * @author ullul@wirehub.co.id
 * @version 1.0
 */
 
@Entity
public class KoferaSubscription extends KoferaModel{
	String name;

	/**
	 * A convenience constructor
	 **/
	public KoferaSubscription(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return name
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
	 * A convenience constructor
	 **/
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{id : ").append(id).append(", createdAt: ").append(createdAt)
				.append(", name: ").append(name).append("}");
		return builder.toString();
	}

}

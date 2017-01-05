/**
 * Copyright 2017 Kofera Technology Inc. All Rights Reserved.
 */
package com.kofera.app.web.entities;

import com.googlecode.objectify.annotation.Entity;

/**
 * <p>
 * 1. Owner → primary owner of the account (can add another users)
 * 2. Admin → administrator with all access (can add another users bu can't delete Owner)
 * 3. Manager → manage certain property in Kofera (eg. manage some AdWords account under MCC)
 * 4. Billing → Billing manager that can set/add/remove/pay billing
 * 5. Client (if agency) → can view certain part of Kofera depend on the agency admin assignment
 * </p>
 * 
 * This class for @Entity KoferaRole
 * @author zulfikar@kofera.com
 * @version 1.0
 */
@Entity
public class KoferaRole extends KoferaModel {
	String name;
	
	/**
	 * Convenience contructor
	 */
	public KoferaRole(String name) {
		super();
		this.name = name;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{id: ").append(id).append(", name: ").append(name).append(", createdAt: ").append(createdAt)
				.append("}");
		return builder.toString();
	}
	
}

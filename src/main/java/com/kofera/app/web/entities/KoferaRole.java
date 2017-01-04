/**
 * Copyright 2017 Kofera Technology Inc. All Rights Reserved.
 */
package com.kofera.app.web.entities;

import java.util.Date;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

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
 */
@Entity
public class KoferaRole {
	@Id Long id;
	String name;
	Date createdAt;
	
	/**
	 * Simple constructor just sets the date
	 **/
	public KoferaRole() {
		createdAt = new Date();
	}
	
	/**
	 * Convenience contructor
	 */
	public KoferaRole(String name) {
		this();
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

	/**
	 * @return the createdAt
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
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

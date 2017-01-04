/**
 * Copyright 2017 Kofera Technology Inc. All Rights Reserved.
 */
package com.kofera.app.web.entities;

import com.googlecode.objectify.annotation.Entity;

/**
 * <p>
 * 1. Ecommerce
 * 2. Agency
 * 3. SMB
 * 4. Brand
 * </p>
 * This @Entity for Kofera Service
 * 
 * @author agung@wirehub.co.id
 * @version 1.0
 */

@Entity
public class KoferaService extends KoferaModel{
	
	String name;

	/**
	 * A convenience constructor
	 */
	public KoferaService(String name){
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
	 * @param Name the Name to set
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

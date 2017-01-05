/**
 * Copyright 2017 Kofera Technology Inc. All Rights Reserved.
 */
package com.kofera.app.web.entities;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * 1. Standard → $99 monthly (limit by monthly spending ~$15,000)
 * 2. Medium → $199 monthly (limit by monthly spending ~$35,000)
 * 3. Large → $499 monthly (limit by monthly spending ~$75,000 + additional $99 for extra $10,000 spent)
 * 4. Enterprise → based on the business deals (unlimited)
 * 
 * This @Entity for kofera package
 * 
 * @author ullul@wirehub.co.id
 * @version 1.0
 */
@Entity
public class KoferaPackage extends KoferaModel{
	String name;
	Long price;
	Long limitSpending;
	
	/**
	 * A convenience constructor
	 **/
	public KoferaPackage(String name, Long price, Long limitSpending) {
		super();
		this.name = name;
		this.price = price;
		this.limitSpending = limitSpending;
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
	 * @return price
	 */
	public Long getPrice() {
		return price;
	}
	
	/**
	 * @param price the price to set
	 */
	public void setPrice(Long price) {
		this.price = price;
	}

	/**
	 * @return limitSpending
	 */
	public Long getLimitSpending() {
		return limitSpending;
	}

	/**
	 * @param limitSpending the limitSpending to set
	 */
	public void setLimitSpending(Long limitSpending) {
		this.limitSpending = limitSpending;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{id: ").append(id).append(", createdAt: ").append(createdAt)
				.append(", name: ").append(name).append(", price: ")
				.append(price).append(", limitSpending: ").append(limitSpending).append("}");
		return builder.toString();
	}
	
}

/**
 * Copyright 2017 Kofera Technology Inc. All Rights Reserved.
 */
package com.kofera.app.web.entities;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

/**
 * 1. Ecommerce Dashboard
 * 2. Report Builder
 * 3. Campaign Builder (standard search, display, agency)
 * 4. Agency Dashboard
 * 5. Tools QS/Pos Distribution
 * 6. Tools Keywords Segment
 * 7. Tools Query Score
 * 8. Tools Hourly Performance
 * 9. Tools Keywords Duplicate Finder
 * 10. Tools Keywords Suggestion Tools - Free
 * 11. Tools Keywords Suggestion Tools - Register
 * 12. Tools Keywords Suggestion Tools 
 * 13. Campaign Builder (dynamic remarketing)
 * 14. Campaign Builder (shopping)
 * 15. Campaign Builder (Facebook)
 * 
 * This class for @Entity KoferaFeature
 * 
 * @author zakaria@kofera.com
 *
 */

@Entity
public class KoferaFeature {
	@Id Long id;
	String name;
	
	public KoferaFeature(String name){
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
		builder.append("{id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append("}");
		return builder.toString();
	}
	
	
}

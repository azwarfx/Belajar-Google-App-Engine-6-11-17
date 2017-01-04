package com.kofera.app.web.entities;

import java.util.Date;

import com.googlecode.objectify.annotation.Id;

/**
 * This is Abstarct Entity for base definition of model
 * @author zulfikaridris
 * @version 1.0
 */
public abstract class KoferaModel {
	@Id
	Long id;
	Date createdAt;
	Date updatedAt;
	
	/**
	 * simple constructor
	 */
	public KoferaModel() {
		this.createdAt = new Date();
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
	 * @return the updatedAt
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * @param updatedAt the updatedAt to set
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	
}

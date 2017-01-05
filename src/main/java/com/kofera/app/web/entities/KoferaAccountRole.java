/**
 * Copyright 2017 Kofera Technology Inc. All Rights Reserved.
 */
package com.kofera.app.web.entities;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Parent;

/**
 * 
 * This class for @Entity KoferaAccountRole
 * 
 * @author zulfikar@kofera.com
 * @version 1.0
 */
@Entity
public class KoferaAccountRole extends KoferaModel {
	@Parent Key<KoferaAccount> koferaId;
	Key<KoferaRole> roleId;
	Key<KoferaAccount> ownerId;
	
	/**
	 * A convenience constructor
	 */
	public KoferaAccountRole(Key<KoferaAccount> koferaId, Key<KoferaRole> roleId) {
		super();
		this.koferaId = koferaId;
		this.roleId = roleId;
	}
	
	/**
	 * Full constructor
	 */
	public KoferaAccountRole(Key<KoferaAccount> koferaId, Key<KoferaRole> roleId, Key<KoferaAccount> ownerId) {
		this(koferaId, roleId);
		this.ownerId = ownerId;
	}

	/**
	 * @return the koferaId
	 */
	public Key<KoferaAccount> getKoferaId() {
		return koferaId;
	}

	/**
	 * @param koferaId the koferaId to set
	 */
	public void setKoferaId(Key<KoferaAccount> koferaId) {
		this.koferaId = koferaId;
	}

	/**
	 * @return the roleId
	 */
	public Key<KoferaRole> getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(Key<KoferaRole> roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the ownerId
	 */
	public Key<KoferaAccount> getOwnerId() {
		return ownerId;
	}

	/**
	 * @param ownerId the ownerId to set
	 */
	public void setOwnerId(Key<KoferaAccount> ownerId) {
		this.ownerId = ownerId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{koferaId: ").append(koferaId).append(", roleId: ").append(roleId).append(", ownerId: ")
				.append(ownerId).append(", id: ").append(id).append(", createdAt: ").append(createdAt)
				.append(", updatedAt: ").append(updatedAt).append("}");
		return builder.toString();
	}
}

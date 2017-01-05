/**
 * Copyright 2017 Kofera Technology Inc. All Rights Reserved.
 */
package com.kofera.app.web.entities;

import java.util.Date;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Parent;

/**
 * This class for @Entity kofera auth facebook
 * 
 * @author zakaria@kofera.com
 * @version 1.0
 *
 */

@Entity
public class KoferaAuthFacebook {
	@Id
	Long accountId;
	@Parent
	Key<KoferaAccount> koferaId;
	String refreshToken;
	String accessToken;
	Date createdAt;
	Date updatedAt;

	public KoferaAuthFacebook(Long accountId, Key<KoferaAccount> koferaId, String refreshToken, String accessToken,
			Date createdAt) {
		super();
		this.accountId = accountId;
		this.koferaId = koferaId;
		this.refreshToken = refreshToken;
		this.accessToken = accessToken;
		this.createdAt = createdAt;
	}

	/**
	 * @return the accountId
	 */
	public Long getAccountId() {
		return accountId;
	}

	/**
	 * @return the koferaId
	 */
	public Key<KoferaAccount> getKoferaId() {
		return koferaId;
	}

	/**
	 * @return the refreshToken
	 */
	public String getRefreshToken() {
		return refreshToken;
	}

	/**
	 * @param refreshToken
	 *            the refreshToken to set
	 */
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	/**
	 * @return the accessToken
	 */
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * @param accessToken
	 *            the accessToken to set
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * @return the createdAt
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt
	 *            the createdAt to set
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @param updatedAt
	 *            the updatedAt to set
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * @return the updatedAt
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{accountId=");
		builder.append(accountId);
		builder.append(", koferaId=");
		builder.append(koferaId);
		builder.append(", refreshToken=");
		builder.append(refreshToken);
		builder.append(", accessToken=");
		builder.append(accessToken);
		builder.append("}");
		return builder.toString();
	}

}

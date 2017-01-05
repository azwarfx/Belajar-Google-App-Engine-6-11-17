/**
 * Copyright 2017 Kofera Technology Inc. All Rights Reserved.
 */
package com.kofera.app.web.entities;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Parent;

/**
 * This class for @Entity kofera auth facebook
 * 
 * @author zakaria@kofera.com
 * @version 1.0
 *
 */

@Entity
public class KoferaAuthFacebook extends KoferaModel{
	@Index
	Long accountId;
	@Parent
	Key<KoferaAccount> koferaId;
	String refreshToken;
	String accessToken;

	public KoferaAuthFacebook(Long accountId, Long koferaId, String refreshToken, String accessToken) {
		super();
		this.accountId = accountId;
		this.koferaId = Key.create(KoferaAccount.class, koferaId);
		this.refreshToken = refreshToken;
		this.accessToken = accessToken;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{accountId:");
		builder.append(accountId);
		builder.append(", koferaId:");
		builder.append(koferaId);
		builder.append(", refreshToken:");
		builder.append(refreshToken);
		builder.append(", accessToken:");
		builder.append(accessToken);
		builder.append(", created:");
		builder.append(createdAt);
		builder.append("}");
		return builder.toString();
	}
	
	

}

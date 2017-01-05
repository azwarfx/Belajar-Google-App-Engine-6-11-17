/**
 * Copyright 2017 Kofera Technology Inc. All Rights Reserved.
 */
package com.kofera.app.web.entities;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Parent;

/**
 * This @Entity for kofera auth google adwords
 * 
 * @author fitri@kofera.com
 * @version 1.0
 */

@Entity
public class KoferaAuthGoogleAdwords extends KoferaModel {

	@Index
	Long accountId;
	@Parent
	Key<KoferaAccount> koferaId;
	String refresh_token;
	String access_token;

	/**
	 * A convenience constructor
	 */
	public KoferaAuthGoogleAdwords(Long accountId, Long koferaId, String refresh_token, String access_token) {
		super();
		this.accountId = accountId;
		this.koferaId = Key.create(KoferaAccount.class, koferaId);
		this.refresh_token = refresh_token;
		this.access_token = access_token;
	}
	
	
	/**
	 * @return the accountId
	 */
	public Long getAccountId() {
		return accountId;
	}

	/**
	 * @param set
	 *            accountId to this accountId
	 */
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	/**
	 * @return the koferaId
	 */
	public Key<KoferaAccount> getKoferaId() {
		return koferaId;
	}

	/**
	 * @param set
	 *            koferaId to this koferaId
	 */
	public void setKoferaId(Key<KoferaAccount> koferaId) {
		this.koferaId = koferaId;
	}

	/**
	 * @return the refresh_token
	 */
	public String getRefresh_token() {
		return refresh_token;
	}

	/**
	 * @param set
	 *            refresh_token to this refresh_token
	 */
	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}

	/**
	 * @return the access_token
	 */
	public String getAccess_token() {
		return access_token;
	}

	/**
	 * @param set
	 *            access_token to this access_token
	 */
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{accountId: ").append(accountId).append(", created: ").append(createdAt).append(", koferaId:")
				.append(koferaId).append(", refresh_token: ").append(refresh_token).append(", access_token: ")
				.append(access_token).append("}");
		return builder.toString();
	}

}

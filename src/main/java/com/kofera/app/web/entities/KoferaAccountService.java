/**
 * Copyright 2017 Kofera Technology Inc. All Rights Reserved.
 */
package com.kofera.app.web.entities;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Parent;

/**
 * This @Entity for kofera account service
 * 
 * @author agung@wirehub.co.id
 * @version 1.0
 */
@Entity
public class KoferaAccountService extends KoferaModel{
	
	@Parent Key<KoferaAccount> kofera_id;
	@Parent Key<KoferaService> service_id;

	/**
	 * A convenience constructor
	 */
	public KoferaAccountService(Long kofera_id, Long service_id) {
		super();
		this.kofera_id = Key.create(KoferaAccount.class, kofera_id);
		this.service_id = Key.create(KoferaService.class, service_id);
	}

	/**
	 * @return kofera_id
	 */
	public Key<KoferaAccount> getKofera_id() {
		return kofera_id;
	}

	/**
	 * @return service_id
	 */
	public Key<KoferaService> getService_id() {
		return service_id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{id: ").append(id).append(", created: ").append(createdAt)
		.append(", kofera_id:").append(kofera_id).append(", service_id: ")
		.append(service_id).append("}");
		return builder.toString();
	}
}

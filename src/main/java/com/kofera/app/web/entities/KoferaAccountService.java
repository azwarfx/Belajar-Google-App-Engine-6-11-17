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
	
	@Parent Key<KoferaAccount> koferaId;
	Key<KoferaService> serviceId;

	/**
	 * A convenience constructor
	 */
	public KoferaAccountService(Long koferaId, Long serviceId) {
		super();
		this.koferaId = Key.create(KoferaAccount.class, koferaId);
		this.serviceId = Key.create(KoferaService.class, serviceId);
	}

	/**
	 * @return kofera_id
	 */
	public Key<KoferaAccount> getKoferaId() {
		return koferaId;
	}

	/**
	 * @return service_id
	 */
	public Key<KoferaService> getServiceId() {
		return serviceId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{id: ").append(id).append(", created: ").append(createdAt)
		.append(", koferaId:").append(koferaId).append(", serviceId: ")
		.append(serviceId).append("}");
		return builder.toString();
	}
}

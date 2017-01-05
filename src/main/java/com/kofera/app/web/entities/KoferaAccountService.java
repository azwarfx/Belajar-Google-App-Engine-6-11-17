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
	public KoferaAccountService(Key<KoferaAccount> koferaId, Key<KoferaService> serviceId) {
		super();
		this.koferaId = koferaId;
		this.serviceId = serviceId;
	}

	
	/**
	 * @param koferaId the koferaId to set
	 */
	public void setKoferaId(Key<KoferaAccount> koferaId) {
		this.koferaId = koferaId;
	}


	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(Key<KoferaService> serviceId) {
		this.serviceId = serviceId;
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{id: ").append(id).append(", created: ").append(createdAt)
		.append(", koferaId:").append(koferaId).append(", serviceId: ")
		.append(serviceId).append(", updateAt: ")
		.append(updatedAt).append("}");
		return builder.toString();
	}
}

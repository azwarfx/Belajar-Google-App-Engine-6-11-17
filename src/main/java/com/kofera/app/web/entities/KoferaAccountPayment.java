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
public class KoferaAccountPayment extends KoferaModel{
	
	@Parent Key<KoferaAccount> koferaId;
	Key<KoferaPayment> paymentId;
	String information;

	/**
	 * @param information
	 */
	public KoferaAccountPayment(Key<KoferaAccount> koferaId, 
			Key<KoferaPayment> paymentId, String information) {
		super();
		this.koferaId = koferaId;
		this.paymentId = paymentId;
		this.information = information;
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
	 * @return the paymentId
	 */
	public Key<KoferaPayment> getPaymentId() {
		return paymentId;
	}

	/**
	 * @param paymentId the paymentId to set
	 */
	public void setPaymentId(Key<KoferaPayment> paymentId) {
		this.paymentId = paymentId;
	}

	/**
	 * @return the information
	 */
	public String getInformation() {
		return information;
	}

	/**
	 * @param information the information to set
	 */
	public void setInformation(String information) {
		this.information = information;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{id: ").append(id).append(", created: ").append(createdAt)
		.append(", koferaId:").append(koferaId).append(", paymentId: ")
		.append(paymentId).append(", updateAt: ")
		.append(", information:").append(information)
		.append(updatedAt).append("}");
		return builder.toString();
	}

}

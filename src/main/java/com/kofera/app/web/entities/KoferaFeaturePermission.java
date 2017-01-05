/**
 * Copyright 2017 Kofera Technology Inc. All Rights Reserved.
 */
package com.kofera.app.web.entities;


import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
/**
 * This @Entity for kofera feature permission
 * 
 * @author azwar@kofera.com
 * @version 1.0
 */
@Entity
public class KoferaFeaturePermission extends KoferaModel{
	//String name;
	Key<KoferaService> koferaService; //mendapatkan id dari Kofera Service
	Key<KoferaFeature> koferaFeature; // Mendapatkan id dari kofera feature
	Key<KoferaSubscription> koferaSubscription; //Mendapatkan id dari kofera subscription
	public KoferaFeaturePermission(Long koferaService,Long koferaFeature,Long koferaSubscription) {
		super();
		this.koferaService =Key.create(KoferaService.class, koferaService);
		this.koferaFeature =Key.create(KoferaFeature.class, koferaFeature);
		this.koferaSubscription =Key.create(KoferaSubscription.class, koferaSubscription);
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{id Subscription:");
		builder.append(koferaSubscription);
		builder.append(", id Service:");
		builder.append(koferaService);
		builder.append("id Feature:");
		builder.append(koferaFeature);
		builder.append("}");
		return builder.toString();
	}
	
}

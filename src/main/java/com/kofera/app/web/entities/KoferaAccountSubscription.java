/**
 * Copyright 2017 Kofera Technology Inc. All Rights Reserved.
 */
package com.kofera.app.web.entities;

import java.util.Date;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Parent;

/**
 * This @Entity for kofera account subscription
 * 
 * @author ullul@wirehub.co.id
 * @version 1.0
 */
@Entity
public class KoferaAccountSubscription extends KoferaModel{
	@Parent Key<KoferaAccount> koferaId;
	Key<KoferaSubscription> subscriptionId;
	Key<KoferaPackage> packageId;
	Date subscribeAt;
	Date expiredAt;
	Long additionalPrice;
	Long additionalLimitSpending;
	
	public KoferaAccountSubscription() {
	}

	/**
	 * A convenience constructor
	 **/
	public KoferaAccountSubscription(Long koferaId, Integer subscriptionId, Integer packageId) {
		this();
		this.koferaId = Key.create(KoferaAccount.class, koferaId);
		this.subscriptionId = Key.create(KoferaSubscription.class, subscriptionId);
		this.packageId = Key.create(KoferaPackage.class, packageId);
	}

	/**
	 * @return koferaId
	 */
	public Key<KoferaAccount> getKoferaId() {
		return koferaId;
	}
	
	/**
	 * @return subscriptionId
	 */
	public Key<KoferaSubscription> getSubscriptionId() {
		return subscriptionId;
	}
	
	/**
	 * @return packageId
	 */
	public Key<KoferaPackage> getPackageId() {
		return packageId;
	}
	
	/**
	 * @return subscribeAt
	 */
	public Date getSubscribeAt() {
		return subscribeAt;
	}

	/**
	 * @param subscribeAt the subscribeAt to set
	 */
	public void setSubscribeAt(Date subscribeAt) {
		this.subscribeAt = subscribeAt;
	}

	/**
	 * @return expiredAt
	 */
	public Date getExpiredAt() {
		return expiredAt;
	}

	/**
	 * @param expiredAt the expiredAt to set
	 */
	public void setExpiredAt(Date expiredAt) {
		this.expiredAt = expiredAt;
	}

	/**
	 * @return additionalPrice
	 */
	public Long getAdditionalPrice() {
		return additionalPrice;
	}

	/**
	 * @param the additionalPrice to set
	 */
	public void setAdditionalPrice(Long additionalPrice) {
		this.additionalPrice = additionalPrice;
	}

	/**
	 * @return additionalLimitSpending
	 */
	public Long getAdditionalLimitSpending() {
		return additionalLimitSpending;
	}

	/**
	 * @param the additionalLimitSpending to set
	 */
	public void setAdditionalLimitSpending(Long additionalLimitSpending) {
		this.additionalLimitSpending = additionalLimitSpending;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{koferaId: ").append(koferaId).append(", subscriptionId: ")
				.append(subscriptionId).append(", packageId: ").append(packageId).append(", subscribeAt: ")
				.append(subscribeAt).append(", expiredAt: ").append(expiredAt).append(", additionalPrice: ")
				.append(additionalPrice).append(", additionalLimitSpending: ").append(additionalLimitSpending)
				.append("}");
		return builder.toString();
	}
	
	
}

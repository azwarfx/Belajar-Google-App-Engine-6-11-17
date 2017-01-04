/**
 * Copyright 2017 Kofera Technology Inc. All Rights Reserved.
 */
package com.kofera.app.web.entities;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

/**
 * This @Entity for kofera account
 * 
 * @author zulfikar@kofera.com
 * @version 1.0
 */
@Entity
public class KoferaAccount {
	@Id
	Long id;
}

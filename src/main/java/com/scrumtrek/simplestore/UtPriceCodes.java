/**
 * 
 */
package com.scrumtrek.simplestore;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.core.IsNull.*;
import static org.hamcrest.core.Is.is;


import junit.framework.Assert;

/**
 * @author admin
 *
 */
public class UtPriceCodes {

	@Test
	public void test() {
		assertThat(PriceCodes.valueOf("Childrens"),is(notNullValue()));
		assertThat(PriceCodes.valueOf("NewRelease"),is(notNullValue()));
		assertThat(PriceCodes.valueOf("Regular"),is(notNullValue()));
	}

}

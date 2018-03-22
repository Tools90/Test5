package com.unislabs.webapptest.test;

import org.junit.Assert;
import org.junit.Test;

import com.unislabs.webapptest.Main;

public class MainTest extends Assert {
	@Test
	public void testSum() {
		assertTrue(5 == Main.sum(3, 2));
	}

}

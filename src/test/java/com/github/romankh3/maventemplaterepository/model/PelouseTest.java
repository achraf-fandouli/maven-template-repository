package com.github.romankh3.maventemplaterepository.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PelouseTest {

	@Test
	public void test_pelouse_constructor() {
		Pelouse pelouse = new Pelouse(5, 5);
		assertEquals(5, pelouse.getMaxX());
		assertEquals(5, pelouse.getMaxY());
	}

	@Test
	public void test_setters_and_getters() {
		Pelouse pelouse = new Pelouse(5, 5);
		pelouse.setMaxX(10);
		pelouse.setMaxY(10);
		assertEquals(10, pelouse.getMaxX());
		assertEquals(10, pelouse.getMaxY());
	}
}

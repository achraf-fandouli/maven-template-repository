package com.github.romankh3.maventemplaterepository.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TondeuseTest {

	@Test
	public void test_tondeuse_constructor() {
		Tondeuse tondeuse = new Tondeuse(1, 2, 'N');
		assertEquals(1, tondeuse.getX());
		assertEquals(2, tondeuse.getY());
		assertEquals('N', tondeuse.getOrientation());
	}

	@Test
	public void test_getters_and_setters() {
		Tondeuse tondeuse = new Tondeuse(1, 2, 'N');
		tondeuse.setX(3);
		tondeuse.setY(4);
		tondeuse.setOrientation('E');
		assertEquals(3, tondeuse.getX());
		assertEquals(4, tondeuse.getY());
		assertEquals('E', tondeuse.getOrientation());
	}
}

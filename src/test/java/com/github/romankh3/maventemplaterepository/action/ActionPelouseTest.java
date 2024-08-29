package com.github.romankh3.maventemplaterepository.action;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.github.romankh3.maventemplaterepository.model.Pelouse;

public class ActionPelouseTest {

	@Test
	public void test_is_in_interval() {
		Pelouse pelouse = new Pelouse(5, 5);
		ActionPelouse actionPelouse = new ActionPelouse();

		assertTrue(actionPelouse.isInInterval(pelouse, 3, 3));
		assertFalse(actionPelouse.isInInterval(pelouse, 6, 6));
		assertFalse(actionPelouse.isInInterval(pelouse, -1, 3));
	}
}

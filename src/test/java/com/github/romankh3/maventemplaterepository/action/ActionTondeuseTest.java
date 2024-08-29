package com.github.romankh3.maventemplaterepository.action;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.github.romankh3.maventemplaterepository.model.Pelouse;
import com.github.romankh3.maventemplaterepository.model.Tondeuse;

public class ActionTondeuseTest {

	@Test
	public void test_turn_left() {
		Tondeuse tondeuse = new Tondeuse(0, 0, 'N');
		ActionTondeuse actionTondeuse = new ActionTondeuse();
		actionTondeuse.executeInstructions("G", null, tondeuse);
		assertEquals('W', tondeuse.getOrientation());
	}

	@Test
	public void test_turn_right() {
		Tondeuse tondeuse = new Tondeuse(0, 0, 'N');
		ActionTondeuse actionTondeuse = new ActionTondeuse();
		actionTondeuse.executeInstructions("D", null, tondeuse);
		assertEquals('E', tondeuse.getOrientation());
	}

	@Test
	public void test_advance_in_interval() {
		Pelouse pelouse = new Pelouse(5, 5);
		Tondeuse tondeuse = new Tondeuse(1, 2, 'N');
		ActionTondeuse actionTondeuse = new ActionTondeuse();
		actionTondeuse.executeInstructions("A", pelouse, tondeuse);
		assertEquals(1, tondeuse.getX());
		assertEquals(3, tondeuse.getY());
	}

	@Test
	public void test_advance_out_of_interval() {
		Pelouse pelouse = new Pelouse(5, 5);
		Tondeuse tondeuse = new Tondeuse(5, 5, 'N');
		ActionTondeuse actionTondeuse = new ActionTondeuse();
		actionTondeuse.executeInstructions("A", pelouse, tondeuse);
		assertEquals(5, tondeuse.getX());
		assertEquals(5, tondeuse.getY()); // Ne doit pas avancer car hors limites
	}

	@Test
	public void test_execute_instructions() {
		Pelouse pelouse = new Pelouse(5, 5);
		Tondeuse tondeuse = new Tondeuse(1, 2, 'N');
		ActionTondeuse actionTondeuse = new ActionTondeuse();
		actionTondeuse.executeInstructions("GAGAGAGAA", pelouse, tondeuse);
		assertEquals("1 3 N ", actionTondeuse.getPosition(tondeuse));
	}
}

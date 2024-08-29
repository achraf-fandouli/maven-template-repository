package com.github.romankh3.maventemplaterepository.model;

/**
 * La classe Tondeuse représente une tondeuse qui se déplace sur une pelouse en
 * suivant des instructions. Elle est définie par ses coordonnées (x, y) et son
 * orientation (N, E, S, W).
 */
public class Tondeuse {

	/**
	 * La coordonnée en X de la tondeuse.
	 */
	private int x;

	/**
	 * La coordonnée en Y de la tondeuse.
	 */
	private int y;

	/**
	 * L'orientation de la tondeuse (N pour Nord, E pour Est, S pour Sud, W pour
	 * Ouest).
	 */
	private char orientation;

	public Tondeuse(int x, int y, char orientation) {
		super();
		this.x = x;
		this.y = y;
		this.orientation = orientation;
	}

	public char getOrientation() {
		return orientation;
	}

	public void setOrientation(char orientation) {
		this.orientation = orientation;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}

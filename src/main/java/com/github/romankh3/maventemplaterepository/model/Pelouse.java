package com.github.romankh3.maventemplaterepository.model;

/**
 * La classe Pelouse représente une pelouse rectangulaire sur laquelle la tondeuse peut se déplacer.
 * Elle est définie par des coordonnées maximales en X et Y.
 */
public class Pelouse {

	/**
	 * La coordonnée maximale en X de la pelouse.
	 */
	private int maxX;
	
	/**
	 * La coordonnée maximale en Y de la pelouse.
	 */
	private int maxY;

	/**
     * Constructeur de la classe Pelouse.
     *
     * @param maxX La coordonnée maximale en X.
     * @param maxY La coordonnée maximale en Y.
	 */
	public Pelouse(int maxX, int maxY) {
		this.maxX = maxX;
		this.maxY = maxY;
	}

	public int getMaxX() {
		return maxX;
	}

	public void setMaxX(int maxX) {
		this.maxX = maxX;
	}

	public int getMaxY() {
		return maxY;
	}

	public void setMaxY(int maxY) {
		this.maxY = maxY;
	}
	
	

}

package com.github.romankh3.maventemplaterepository.action;

import com.github.romankh3.maventemplaterepository.model.Pelouse;
import com.github.romankh3.maventemplaterepository.model.Tondeuse;

/**
 * La classe ActionTondeuse fournit des méthodes pour exécuter des instructions
 * et manipuler la tondeuse.
 */
public class ActionTondeuse {

	/**
	 * 
	 * Exécute une série d'instructions pour déplacer la tondeuse sur la pelouse.
	 *
	 * @param instructions Les instructions à exécuter (G pour gauche, D pour
	 *                     droite, A pour avancer).
	 * @param pelouse      La pelouse sur laquelle se déplace la tondeuse.
	 * @param tondeuse     La tondeuse à manipuler.
	 */
	public void executeInstructions(String instructions, Pelouse pelouse, Tondeuse tondeuse) {
		for (char instruction : instructions.toCharArray()) {
			switch (instruction) {
			case 'G':
				turnLeft(tondeuse);
				break;
			case 'D':
				turnRight(tondeuse);
				break;
			case 'A':
				advance(pelouse, tondeuse);
				break;
			}
		}
	}

	/**
	 * Tourne la tondeuse vers la gauche (90° dans le sens antihoraire).
	 *
	 * @param tondeuse La tondeuse à manipuler.
	 */
	private void turnLeft(Tondeuse tondeuse) {
		switch (tondeuse.getOrientation()) {
		case 'N':
			tondeuse.setOrientation('W');
			break;
		case 'W':
			tondeuse.setOrientation('S');
			break;
		case 'S':
			tondeuse.setOrientation('E');
			break;
		case 'E':
			tondeuse.setOrientation('N');
			break;
		}
	}

	/**
	 * Tourne la tondeuse vers la droite (90° dans le sens horaire).
	 *
	 * @param tondeuse La tondeuse à manipuler.
	 */
	private void turnRight(Tondeuse tondeuse) {
		switch (tondeuse.getOrientation()) {
		case 'N':
			tondeuse.setOrientation('E');
			break;
		case 'E':
			tondeuse.setOrientation('S');
			break;
		case 'S':
			tondeuse.setOrientation('W');
			break;
		case 'W':
			tondeuse.setOrientation('N');
			break;
		}
	}

	/**
	 * 
	 * Fait avancer la tondeuse d'une case dans la direction où elle est orientée.
	 *
	 * @param pelouse  La pelouse sur laquelle se déplace la tondeuse.
	 * @param tondeuse La tondeuse à manipuler.
	 */
	private void advance(Pelouse pelouse, Tondeuse tondeuse) {
		int newX = tondeuse.getX(), newY = tondeuse.getY();
		switch (tondeuse.getOrientation()) {
		case 'N':
			newY++;
			break;
		case 'E':
			newX++;
			break;
		case 'S':
			newY--;
			break;
		case 'W':
			newX--;
			break;
		}
		ActionPelouse actionPelouse = new ActionPelouse();
		if (actionPelouse.isInInterval(pelouse, newX, newY)) {
			tondeuse.setX(newX);
			tondeuse.setY(newY);
		}
	}

	/**
	 * 
	 * Retourne la position actuelle de la tondeuse sous forme de chaîne de
	 * caractères.
	 *
	 * @param tondeuse La tondeuse dont la position doit être obtenue.
	 * @return Une chaîne de caractères représentant la position et l'orientation
	 *         actuelles de la tondeuse.
	 */
	public String getPosition(Tondeuse tondeuse) {
		return tondeuse.getX() + " " + tondeuse.getY() + " " + tondeuse.getOrientation() + " ";
	}
}

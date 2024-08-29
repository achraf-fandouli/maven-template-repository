package com.github.romankh3.maventemplaterepository.action;

import com.github.romankh3.maventemplaterepository.model.Pelouse;

/**
 * La classe ActionPelouse fournit des méthodes pour vérifier les contraintes
 * liées à la pelouse.
 */
public class ActionPelouse {

	/**
	 * 
	 * Vérifie si une position donnée (x, y) se trouve dans les limites de la
	 * pelouse.
	 *
	 * @param pelouse La pelouse à vérifier.
	 * @param x       La coordonnée en X à vérifier.
	 * @param y       La coordonnée en Y à vérifier.
	 * @return true si la position est dans les limites de la pelouse, sinon false.
	 */
	public boolean isInInterval(Pelouse pelouse, int x, int y) {
		return x >= 0 && x <= pelouse.getMaxX() && y >= 0 && y <= pelouse.getMaxY();
	}

}

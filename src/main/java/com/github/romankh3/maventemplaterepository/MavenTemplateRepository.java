package com.github.romankh3.maventemplaterepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.github.romankh3.maventemplaterepository.action.ActionTondeuse;
import com.github.romankh3.maventemplaterepository.model.Pelouse;
import com.github.romankh3.maventemplaterepository.model.Tondeuse;

/**
 * Main class for Java Repository Template.
 */
public class MavenTemplateRepository {

	public static void main(String[] args) {
		try {
			// Lire le fichier d'entrée en une seule ligne
			String line = readLineFromFile("src/main/resources/input.txt");

			// Analyser et exécuter les instructions
			executerTondeuses(line);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * Lit la première ligne d'un fichier spécifié.
	 *
	 * @param filename Le chemin du fichier à lire.
	 * @return La première ligne du fichier.
	 * @throws IOException Si une erreur survient lors de la lecture du fichier.
	 */
	private static String readLineFromFile(String filename) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			return br.readLine();
			// Lire la première (et unique) ligne
		}
	}

	/**
	 * 
	 * Exécute les instructions pour déplacer les tondeuses sur la pelouse.
	 *
	 * @param input Une chaîne de caractères contenant les dimensions de la pelouse,
	 *              les positions initiales et les instructions pour chaque
	 *              tondeuse.
	 */
	private static void executerTondeuses(String input) {
		// Split the input by spaces
		String[] parts = input.split(" ");
		int maxX = Integer.parseInt(parts[0]);
		int maxY = Integer.parseInt(parts[1]);
		Pelouse pelouse = new Pelouse(maxX, maxY);

		int i = 2;
		while (i < parts.length) {
			// Position initiale de la tondeuse
			int x = Integer.parseInt(parts[i]);
			int y = Integer.parseInt(parts[i + 1]);
			char orientation = parts[i + 2].charAt(0);

			// Instructions
			String instructions = parts[i + 3];

			// Créer et exécuter la tondeuse
			Tondeuse tondeuse = new Tondeuse(x, y, orientation);
			ActionTondeuse actionTondeuse = new ActionTondeuse();
			actionTondeuse.executeInstructions(instructions, pelouse, tondeuse);

			// Afficher la position finale de la tondeuse
			System.out.print(actionTondeuse.getPosition(tondeuse));

			i += 4; // Passer à la prochaine tondeuse
		}
	}
}

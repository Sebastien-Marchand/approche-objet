package fr.diginamic.formes;

/**
 * @author Sebastien MARCHAND
 * 
 * classe qui represente un carre
 *
 */
public class Carre extends Rectangle{
	public double longueur;

	/**
	 *calcule la surface d'un carre
	 */
	public double CalculerSurface() {
		return Math.pow(longueur, 2);
	}


	/**
	 *calcule le perimetre d'un carre
	 */
	public double CalculerPerimetre() {
		return longueur*4;
	}

}

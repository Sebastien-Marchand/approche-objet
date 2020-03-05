package fr.diginamic.formes;

/**
 * @author Sebastien MARCHAND
 * classe qui represente un rectangle
 *
 */
public class Rectangle extends Forme{
	public double longueur;
	public double largeur ;

	/**
	 *calcule la surface d'un rectangle
	 */
	public double CalculerSurface() {
		
		return longueur*largeur;
	}


	/**
	 *calcul le perimetre d'un rectangle
	 */
	public double CalculerPerimetre() {

		return this.CalculerSurface()*2;
	}

}

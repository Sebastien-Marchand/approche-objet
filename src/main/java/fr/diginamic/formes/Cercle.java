package fr.diginamic.formes;

/**
 * Classe qui represente un cercle
 * @author Sebastien MARCHAND
 *
 */
public class Cercle extends Forme{

	public double rayon;
	
	/**
	 *Calcule la surface du cercle
	 *retourn la surface
	 */
	public double CalculerSurface() {
		double maSurface = Math.PI*(Math.pow(rayon, 2));
		return maSurface;
	}

	/**
	 *calcule le perimetre du cercle
	 *retourne le perimetre
	 */
	public double CalculerPerimetre() {
		double monPerimetre = 2*Math.PI*rayon;
		return monPerimetre;
	}

}

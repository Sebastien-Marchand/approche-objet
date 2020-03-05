package entites;

/**
 * @author Sébastien MARCHAND classe qui représente une cercle
 *
 */
public class Cercle {
	double rayon ;
	
	/**Constructeur Cercle
	 * @param rayon du cercle
	 */
	public Cercle (double rayon)
	{
		this.rayon = rayon;
	}
	
	/**Permet de calculer le perimetre du cercle
	 * @return double
	 * Retourne le perimetre du cercle
	 */
	public double CalculPerimetre()
	{
		double monPerimetre = 2*Math.PI*rayon;
		
		return monPerimetre;
	}
	/**
	 * Permet de calculer la surface d'un cercle
	 * @return double
	 * retourne la surface du cercle
	 */
	public double CalculSurface()
	{
		double maSurface = Math.PI*(Math.pow(rayon, 2));
		return maSurface;
	}

}

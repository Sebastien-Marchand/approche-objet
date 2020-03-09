package inter_face;

/**
 * @author Sébastien MARCHAND
 *Class qui représente une cercle
 */
public class Cercle implements ObjetGeometrique{
	/** rayon du cercle*/
	 public double rayon;

	public Cercle(){
		rayon = 5;
	}
	/**
	 *Calcule le perimetre d'un Cercle
	 *@return perimetre
	 */
	public double perimetre() {
		double monPerimetre = 2*Math.PI*rayon;
		return monPerimetre;
	}

	
	/**
	 *Calcule la surface du cercle
	 *@return surface du cercle
	 */
	public double surface() {
		double maSurface = Math.PI*(Math.pow(rayon, 2));
		return maSurface;
	}

}

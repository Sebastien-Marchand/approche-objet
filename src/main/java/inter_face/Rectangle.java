package inter_face;

/**
 * @author Sébastien MARCHAND
 *
 */
public class Rectangle implements ObjetGeometrique{
	
	/** longueur du rectangle*/
	public double longueur;
	/** largeur du rectangle*/
	public double largeur ;
	public Rectangle(){
		longueur = 8;
		largeur = 3;
		
	}
	
	/**
	 *Calcul le perimetre du Rectangle
	 *@return le perimetre
	 */
	public double perimetre() {
		return this.surface()*2;
	}

	
	/**
	 *Calcule la surface du Rectangle
	 */
	public double surface() {
		return longueur*largeur;
	}
	

}

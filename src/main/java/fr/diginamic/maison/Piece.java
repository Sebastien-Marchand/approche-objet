package fr.diginamic.maison;

/**
 * @author Sebastien MARCHAND
 * Classe qui represente une pi�ce encore non d�finie
 *
 */
public class Piece {
	
	/** superficie */
	public double superficie;
	
	/** etage */
	public int etage;
	public int type;
	
	/**Constructeur
	 * @param superficie
	 * @param etage
	 */
	public Piece(double superficie , int etage){
		this.superficie = superficie;
		this.etage = etage;
	}

}

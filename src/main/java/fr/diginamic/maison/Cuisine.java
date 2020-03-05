package fr.diginamic.maison;

/**
 * @author Sebastien MARCHAND
 * Class qui represente une cuisine
 *
 */
public class Cuisine extends Piece{

	/**Constructeur
	 * @param superficie
	 * @param etage
	 */
	public Cuisine(double superficie, int etage) {
		super(superficie, etage);
		this.type = 1;
	}

}

package fr.diginamic.maison;

/**
 * @author Sebastien MARCHAND
 *
 */
public class WC extends Piece{

	/**Constructeur
	 * @param superficie
	 * @param etage
	 */
	public WC(double superficie, int etage) {
		super(superficie, etage);
		this.type = 4;
	}

}

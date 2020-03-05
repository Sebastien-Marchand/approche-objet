package fr.diginamic.maison;

/**
 * @author Sebastien MARCHAND
 * Class qui represente une chambre
 *
 */
public class Chambre extends Piece{

	/**Constructeur
	 * @param superficie
	 * @param etage
	 */
	public Chambre(double superficie, int etage) {
		super(superficie, etage);
		this.type = 0;
	}

}

package fr.diginamic.maison;

/**
 * @author Sebastien MARCHAND
 * Classe qui represente un salon
 *
 */
public class Salon extends Piece{

	/**Constructeur
	 * @param superficie
	 * @param etage
	 */
	public Salon(double superficie, int etage) {
		super(superficie, etage);
		this.type = 2;
	}

}

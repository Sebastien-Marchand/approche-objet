package fr.diginamic.maison;

/**
 * @author Sebastien MARCHAND
 * Classe qui represente une salle de bain
 *
 */
public class SalleDeBain extends Piece{

	/**Constructeur
	 * @param superficie
	 * @param etage
	 */
	public SalleDeBain(double superficie, int etage) {
		super(superficie, etage);
		this.type = 3;
	}

}

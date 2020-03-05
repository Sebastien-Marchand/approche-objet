package essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

/**
 * @author Sebastien MARCHAND
 * Classe qui permet de testé les classe formes : Cercle,rectangle et carré 
 *
 */
public class TestForme {

	public static void main(String[] args) {
		Cercle monCercle = new Cercle();
		monCercle.rayon = 5;
		AffichageForme.Afficher(monCercle);
		
		Rectangle monRectangle = new Rectangle();
		monRectangle.largeur = 2;
		monRectangle.longueur = 8;
		AffichageForme.Afficher(monRectangle);
		
		Carre monCarre = new Carre();
		monCarre.longueur = 6;
		AffichageForme.Afficher(monCarre);

	}

}

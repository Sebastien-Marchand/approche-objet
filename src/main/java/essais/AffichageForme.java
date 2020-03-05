package essais;

import fr.diginamic.formes.Forme;

/**
 * @author Sebastien MARCHAND
 * Permet l'affichage du perimetre
 * Permet l'affichage de la surface
 *
 */
public class AffichageForme {
	
	public static void Afficher(Forme maForme) {
		System.out.println("le perimètre du "+maForme.getClass().getSimpleName() +" vaut : " + maForme.CalculerPerimetre());
		System.out.println("la surface du "+maForme.getClass().getSimpleName() +" vaut : " + maForme.CalculerSurface());
	}

}

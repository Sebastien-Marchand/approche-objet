package essais;
import fr.diginamic.maison.*;

public class TestMaison {

	public static void main(String[] args) {
		Maison maMaison = new Maison();
		maMaison.AjouterPiece(null);
		
		maMaison.AjouterPiece(new Chambre(8.5, 1));
		maMaison.AjouterPiece(new Chambre(15, 1));
		maMaison.AjouterPiece(new SalleDeBain(6, 1));
		
		maMaison.AjouterPiece(new Cuisine(10, 0));
		maMaison.AjouterPiece(new Salon(30, 0));
		maMaison.AjouterPiece(new WC(3, 0));
		
		System.out.println("Superficie total : " + maMaison.GetSuperficieTotal() + "m²");
		System.out.println("Superficie total du RDC : " + maMaison.GetSuperficieEtage(0)+ "m²");
		System.out.println("Superficie total du 1e : " + maMaison.GetSuperficieEtage(1)+ "m²");
		
		System.out.println("Superficie total des chambres : " + maMaison.GetSuperficieType(0));
	}

}

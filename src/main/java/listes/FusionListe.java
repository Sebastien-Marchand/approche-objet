package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	/**
	 * Permet de fusionner 2 array liste dans une seul qui contient toute les valeurs
	 * affiche les tailles des 3 listes pour validation
	 */
	public static void main(String[] args) {
		
		List<String> liste1= new ArrayList<String>();
		
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		List<String> liste2= new ArrayList<String>();
		
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		List<String> liste3= new ArrayList<String>();

		for ( int i = 0 ; i < liste1.size() ; i++)		//ajoute tout les élements de la liste 1	dans la liste 3
		{
			liste3.add(liste1.get(i));
		}
		
		for ( int i = 0 ; i < liste2.size() ; i++)		//ajoute tout les élements de la liste2		dans la liste 3
		{
			liste3.add(liste2.get(i));
		}
		System.out.println("Taille de Liste1  :" +liste1.size() + " Taille de liste2 : " +  liste2.size()
			+" Taille de liste 3 :" + liste3.size());
	}

}

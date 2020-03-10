package listes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListeString {

	public static void main(String[] args) {
		
		ArrayList<String> maListe = new ArrayList<String>(Arrays.asList("Nice" , "Carcassonne" , "Narbonne" , "Lyon" , "Foix" , "Pau" , "Marseille" , "Tarbes"));

		String villePlusGrand = "";
		
		for(int i = 0; i < maListe.size() ; i++)															//Affiche la ville avec le plus de lettre
		{
			if (maListe.get(i).length() > villePlusGrand.length())
			{
				villePlusGrand = maListe.get(i);
			}
		}
		System.out.println("La ville qui à le plus grand nombre de lettre est : " + villePlusGrand);

		maListe.replaceAll(e -> e.toUpperCase());															//remplace toute les lettres par des majuscule
		
		AfficherVille(maListe);
		
		for(int i = 0; i < maListe.size() ; i++)															//supprime de la liste les ville qui commence par N
		{
			if ( maListe.get(i).charAt(0) == 'N')
			{
				maListe.remove(i);
			}
		}
		System.out.println("Nouvelle liste de ville :\n");
		AfficherVille(maListe);
	}
	
	/**
	 * @param ArrayList
	 * Affiche le contenue de la liste ( nom des villes )
	 */
	
	static void AfficherVille(ArrayList<String> laListe)
	{
		for(int i = 0; i < laListe.size() ; i++)
		{
			System.out.println(laListe.get(i));
		}
	}
}

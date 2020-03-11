package maps;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author Sébastien MARCHAND
 * 
 * Ajouter des villes a la map
 * utilise un iterator pour afficher l'ensemble des clé et valeur associé
 * affiche la taille de la map
 *
 */
public class CreationEtManipulationMap {

	public static void main(String[] args) {

		HashMap<Integer, String> mapVilles = new HashMap<>();												//déclare et ajoute des valeurs a la map
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");

		mapVilles.put(59 , "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33 , "Bordeaux");
		
		Iterator<Integer> itMapVilleskey = mapVilles.keySet().iterator();
		Iterator<String> itMapVillesString = mapVilles.values().iterator();
		
		while (itMapVilleskey.hasNext() && itMapVillesString.hasNext())											//parcour les clé et valeur
		{
			
			System.out.println("Key : " + itMapVilleskey.next() +" Valeur :" + itMapVillesString.next());
		}
		
		System.out.println("Taille map :" + mapVilles.size());													//taille map
	}

}

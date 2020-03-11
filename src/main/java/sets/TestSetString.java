package sets;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Sébastien MARCHAND
 * 
 * Permet de manipuler un Set de String
 *
 */
public class TestSetString {

	public static void main(String[] args) {

		HashSet<String> monSetString = new HashSet<String>(Arrays.asList("USA" , "France" , "Allemagne" , "Uk" , "Italie" , "Japon" , "Chine" , "Russie" , "Inde"));

		String paysPlusLong = "";
															//---------------Recherche le pays avec le plus de lettres---------------//
		for(String lePays : monSetString)
		{
			if(lePays.length() > paysPlusLong.length())
			{
				paysPlusLong = lePays;
			}
		}
		
																	//---------------Afficher le pays le plus long---------------//
		System.out.println("Pays avec le plus de lettre : " + paysPlusLong);
		
																	//---------------Supprime le pays trouver---------------//

		if(monSetString.remove(paysPlusLong))
		{
			System.out.println("Suppression du pays dans la liste réussie");
		}
		
																	//---------------Afficher toute les pays---------------//
		for(String lePays : monSetString)
		{
			System.out.println(lePays);
		}
		
		
	}
}

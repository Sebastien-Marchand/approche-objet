package tri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


/**
 * @author Sebastien MARCHAND
 * 
 * Permet de trie des pays en fonction de leur nom,
 *  leur pib ou leur nombre d'habitant
 *
 */
public class TestPays {

	public static void main(String[] args) {

		List<Pays> maListPays = new ArrayList<Pays>(Arrays.asList(new Pays("USA" , 327.2 , 57638d) , 
				new Pays("France" , 66.99 , 43551d) , new Pays("Allemagne" , 82.79 , 50200d) , new Pays("UK" , 66.44 , 43620d) ,
				new Pays("Italie" , 60.48 , 37970d) , new Pays("Japon" , 126.8 , 42659d) , new Pays("Chine" , 1_395.380 , 16624d) , 
				new Pays("Russie" , 146.780 , 27900d) , new Pays("Inde" , 1_368.163 , 5174d)));
		

		Collections.sort(maListPays);
		
		for(Pays monPays : maListPays)
		{
			System.out.println(monPays.getNom());
		}
		
		//----------------------Trie en fonction du pib----------------------//
		
		System.out.println("----------------------Trie pib----------------------");

		Collections.sort(maListPays, new PaysComparator());
		for(Pays monPays : maListPays)
		{
			System.out.println(monPays.getNom() + " PIB : " + monPays.getPib_par_Habitant());
		}
		
		//----------------------Trie en fonction du nb d'habitant----------------------//

		System.out.println("----------------------Trie habitant----------------------");
		Collections.sort(maListPays, new ComparatorHabitant());
		for(Pays monPays : maListPays)
		{
			System.out.println(monPays.getNom() + " PIB : " + monPays.getNbHabitant());
		}
		
		Pays pays1 = new Pays("USA" , 327.2 , 57638d);
		Pays pays2 = new Pays("France" , 66.99 , 43551d);
		Pays pays3 = new Pays("France" , 66.99 , 43551d);
		
		System.out.println("Pays1 est-il égal de pays2 ? rep :" + pays1.equals(pays2));
		System.out.println("Pays2 est-il égal de pays3 ? rep :" + pays2.equals(pays3));

	}

}

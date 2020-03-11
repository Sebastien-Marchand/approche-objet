package maps;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import sets.Pays;

public class MapPays {

	public static void main(String[] args) 
	{
		List<Pays> liste = Arrays.asList(new Pays("USA" , 327.2 , 57638d) , 
				new Pays("France" , 66.99 , 43551d) , new Pays("Allemagne" , 82.79 , 50200d) , new Pays("UK" , 66.44 , 43620d) ,
				new Pays("Italie" , 60.48 , 37970d) , new Pays("Japon" , 126.8 , 42659d) , new Pays("Chine" , 1_395.380 , 16624d) , 
				new Pays("Russie" , 146.780 , 27900d) , new Pays("Inde" , 1_368.163 , 5174d));
		
		HashMap<String , Pays> mapPays = new HashMap<>();
		
		for(Pays monPays : liste)
		{
			mapPays.put(monPays.getNom(), monPays);
		}
		
		Collection<Pays> collPays = mapPays.values();
		
		Iterator<Pays> itPays = collPays.iterator();
		Pays plusPetitPays = itPays.next();
		while(itPays.hasNext())
		{
			Pays paysParcouru = itPays.next();
			if(paysParcouru.getNbHabitant() < plusPetitPays.getNbHabitant())
			{
				plusPetitPays = paysParcouru;
			}
		}
		System.out.println(plusPetitPays.getNom());

		if(mapPays.remove(plusPetitPays.getNom()) != null)
		{
			System.out.println("Suppression réussie");
		}
		
		System.out.println("------------Liste pays restant------------");
		
		itPays = collPays.iterator();
		while(itPays.hasNext())
		{
			System.out.println(itPays.next().getNom());
		}
		
		
	}

}

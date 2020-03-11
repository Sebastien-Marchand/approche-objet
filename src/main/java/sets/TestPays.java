package sets;

import java.util.Arrays;
import java.util.HashSet;

public class TestPays {

	public static void main(String[] args) {

		HashSet<Pays> monSetPays = new HashSet<Pays>(Arrays.asList(new Pays("USA" , 327.2 , 57638d) , 
				new Pays("France" , 66.99 , 43551d) , new Pays("Allemagne" , 82.79 , 50200d) , new Pays("UK" , 66.44 , 43620d) ,
				new Pays("Italie" , 60.48 , 37970d) , new Pays("Japon" , 126.8 , 42659d) , new Pays("Chine" , 1_395.380 , 16624d) , 
				new Pays("Russie" , 146.780 , 27900d) , new Pays("Inde" , 1_368.163 , 5174d)));
		
															//---------------Recherche le pays avec le plus d'habitant---------------//

		Pays hab_high = null;
		for(Pays lePays : monSetPays)
		{
			if(hab_high == null)
			{
				hab_high = lePays;
			}
			else 
			{
				if(hab_high.getNbHabitant() < lePays.getNbHabitant())
				{
					hab_high = lePays;
				}
			}
		}
		System.out.println("Le pays " + hab_high.getNom() + " détient un nombre d'habitant de :" + hab_high.getNbHabitant());
		
															//---------------Recherche le pays avec le pib le plus grand---------------//

		
		Pays pib_par_hab_high = null;
		for(Pays lePays : monSetPays)
		{
			if(pib_par_hab_high == null)
			{
				pib_par_hab_high = lePays;
			}
			else 
			{
				if(pib_par_hab_high.getPib_par_Habitant() < lePays.getPib_par_Habitant())
				{
					pib_par_hab_high = lePays;
				}
			}
		}
		
		System.out.println("Le pays " + pib_par_hab_high.getNom() + " détient le pib le plus grand avec :" + pib_par_hab_high.getPib_par_Habitant());
		
														//---------------Recherche le pays avec le pib le moins elever---------------//

		
		Pays pib_par_hab_low = null;
		for(Pays lePays : monSetPays)
		{
			if(pib_par_hab_low == null)
			{
				pib_par_hab_low = lePays;
			}
			else 
			{
				if(pib_par_hab_low.getPib_par_Habitant() > lePays.getPib_par_Habitant())
				{
					pib_par_hab_low = lePays;
				}
			}
		}
														//---------------Met le pays avec le pib le moins elever en majuscule---------------//

		monSetPays.remove(pib_par_hab_low);
		pib_par_hab_low.nom = pib_par_hab_low.nom.toUpperCase();
		monSetPays.add(pib_par_hab_low);
		Affichage(monSetPays);
		System.out.println("\nLe pays " + pib_par_hab_low.getNom() + " détient le pib le plus petit avec :" + pib_par_hab_low.getPib_par_Habitant());
		
														//---------------Supprime le pays avec le pib le moins---------------//
		monSetPays.remove(pib_par_hab_low);
		Affichage(monSetPays);

	}
	
	/**
	 * Permet d'afficher quelque information d'une liste de Pays
	 * @param HashSet<Pays>listePays
	 */
	public static void Affichage(HashSet<Pays> listePays)
	{
		for(Pays lePays : listePays)
		{
			System.out.println("Le pays " + lePays.getNom() + " détient un nombre d'habitant de :" + lePays.getNbHabitant() + " détient un pib de :" + lePays.getPib_par_Habitant());
		}
		
	}

}

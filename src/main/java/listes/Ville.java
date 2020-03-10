package listes;

import java.util.ArrayList;

public class Ville {

	String ville;
	int habitant;
	
	Ville(String ville, int habitant){
		this.habitant = habitant;
		this.ville = ville;
		
	}
	public static void main(String[] args) {
		ArrayList<Ville> maListe = new ArrayList<>();
		maListe.add(new Ville("Nice",343000));
		maListe.add(new Ville("Carcassonne",47800));
		maListe.add(new Ville("Narbonne",53400));
		maListe.add(new Ville("Lyon",484000));
		maListe.add(new Ville("Foix",9700));
		maListe.add(new Ville("Pau",77200));
		maListe.add(new Ville("Marseille",850700));
		maListe.add(new Ville("Tarbs",40600));

		Ville villePlusPeuple = null;
		for( int i = 0 ; i < maListe.size() ; i++)											//recherche la ville la plus peuplé
		{
			if(villePlusPeuple == null )
			{
				villePlusPeuple = maListe.get(i);
			}
			else
			{
				if(maListe.get(i).habitant > villePlusPeuple.habitant)
				{
					villePlusPeuple = maListe.get(i);
				}
			}
		}
		System.out.println("La ville la plus peuplé est :" + villePlusPeuple.ville
				+ " avec " + villePlusPeuple.habitant + " Habitants");
		
		Ville villeMoinPeuple = null;														//Recherche la ville la moins peuplé
		for(Ville laVille : maListe)
		{
			if(villeMoinPeuple == null )
			{
				villeMoinPeuple = laVille;
			}
			else
			{
				if(laVille.habitant < villeMoinPeuple.habitant)
				{
					villeMoinPeuple = laVille;
				}
			}
		}
		System.out.println("La ville la moins peuplé est :" + villeMoinPeuple.ville
				+ " avec " + villeMoinPeuple.habitant + " Habitants");
		
		
		if(maListe.remove(villeMoinPeuple))											//supprime de la liste la ville la moins peuplé
		{
			System.out.println("Suppresion de la ville réussie");
		}
		
		for( int i = 0 ; i < maListe.size() ; i++)									//convertie en majuscule la ville avec plus de 100 000 habitants
		{
			if(maListe.get(i).habitant > 100000)
			{
				maListe.get(i).ville = maListe.get(i).ville.toUpperCase();
			}
		}
		
		for( int i = 0 ; i < maListe.size() ; i++)									//affiche la liste final des villes
		{
			System.out.println("La ville : " + maListe.get(i).ville + " détiens "+ maListe.get(i).habitant);
		}
		
	}

}

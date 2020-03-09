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

		int HabitantHigh = 0;
		String HabitantHighString = "";
		for( int i = 0 ; i < maListe.size() ; i++)
		{
					//System.out.println(Integer.parseInt(maListe.get(i).substring(maListe.get(i).indexOf(",")+1, maListe.get(i).indexOf("h", maListe.get(i).indexOf(",")))));
		}

	}

}

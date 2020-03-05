package fr.diginamic.chaines;

import entites.Personne;
import fr.diginamic.banque.entites.Compte;

public class ManipulationChaine {

	public static void main (String[] args) {
		String chaine = "Durand;Marcel;012543;1 523.5";
		String[] tabString;
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		System.out.println("Taille : " + chaine.length());
		System.out.println("Index du 1er\" ;\"  : " + chaine.indexOf(';'));
		System.out.println("Nom de famille : " + chaine.subSequence(0, chaine.indexOf(';')));
		System.out.println("Nom de famille : " + chaine.toUpperCase().subSequence(0, chaine.indexOf(';')));
		System.out.println("Nom de famille : " + chaine.toLowerCase().subSequence(0, chaine.indexOf(';')));
		
		tabString = chaine.split(";");
		
		for (String val : tabString)
		{
			System.out.println(val);
		}
		
		Personne client = new Personne(tabString[0],tabString[1]);
		tabString[3] = tabString[3].replace(" ", "");
		
		Compte compteclient = new Compte (Integer.parseInt(tabString[2]), Double.valueOf(tabString[3]));
		System.out.println(compteclient);
	}
}

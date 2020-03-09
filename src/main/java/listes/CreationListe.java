package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		ArrayList maListe = new ArrayList();
		
		for(int i = 0 ; i < 100 ; i++)														//place les chiffre de 1 a 100
		{
			maListe.add(i+1);
		}
			System.out.println("Taile :" + maListe.size());									//affiche la taille
	}
}

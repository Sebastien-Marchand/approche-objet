package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListInt {

	public static void main(String[] args) {
		
		List<Integer> listNum = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
		int max = 0;
		
		for( int nombre : listNum)																					//pour chaque éléments de la liste, affiché le nombre contenue
		{
			System.out.println(nombre);
			if ( max < nombre )																						//recherche l'élement le plus grand
			{
				max = nombre;
			}
		}
		System.out.println("Taille de la liste : " + listNum.size());
		System.out.println("Chiffre maximum de la liste : " + max);
		
		max = 0;
		Iterator<Integer> iterator = listNum.iterator();
		
		while(iterator.hasNext()){
			int monEntier = iterator.next();
			System.out.println(monEntier);
		}
		
		int min  = 0;
		for( int nombre : listNum)																					//pour chaque éléments de la liste, affiché le nombre contenue
		{
			if ( min > nombre )																						//recherche l'élement le plus petit
			{
				min = listNum.indexOf(nombre);
			}
		}
		
		System.out.println("Le plus petit élément est a l'index: " + min);
		
		
		listNum.remove(min);																						//retire le plus petit élement de la liste
		AfficherList(listNum);
		
		listNum.replaceAll(e -> Math.abs(e));																		//remplace chaque valeut par la valeur absolu
		AfficherList(listNum);
	}
	
	/**
	 * @param laListe
	 * affiche tout les élements d'une liste
	 */
	static void AfficherList (List<Integer> laListe)
	{
		for( int nombre : laListe)																					//pour chaque éléments de la liste, affiché le nombre contenue
		{
			System.out.println(nombre);
		}
	}
}

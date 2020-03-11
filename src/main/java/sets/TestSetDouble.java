package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {

	public static void main(String[] args) {

		HashSet<Double> set = new HashSet<>(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));
									//---------------Afficher toute les valeurs---------------//
		Affichage(set);

		
									//---------------Trouver valeur maximum---------------//
		
		double valMax = Double.MIN_VALUE;
		for(Double e : set)
		{
			if(valMax < e)
			{
				valMax = e;
			}
		}
		System.out.println("Valeur max :" + valMax);
		
									//---------------Trouver valeur minimum---------------//

		double valMin = Double.MAX_VALUE;
		
		for(Double e : set)
		{
			if(valMin > e)
			{
				valMin = e;
			}
		}
		System.out.println("Valeur min :" + valMin);
		set.remove(valMin);
		
		/*
								//---------------Supprimer valeur minimum---------------//
		
		Iterator monIT = set.iterator();
		while(monIT.hasNext())
		{
			double val = Double.parseDouble(monIT.next().toString());
			System.out.println(val + " " + valMin);
			if( valMin == val)
			{
				System.out.println("suppresion de : " + val);
				monIT.remove();
			}
		}
		System.out.println("liste Valeur après suppression : ");
		*/
		
		Affichage(set);
	}
	public static void Affichage(HashSet<Double> hsDb)
	{
		for(Double e : hsDb)
		{
			System.out.println(e);
		}
	}

}

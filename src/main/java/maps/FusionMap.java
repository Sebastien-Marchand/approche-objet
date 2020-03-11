package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FusionMap {

	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
																						//ajoute toute les valeur a la map
		//map3.putAll(map1);					
        //map3.putAll(map2);
        
		Iterator<Integer> itMap1Key = map1.keySet().iterator();
		
		while(itMap1Key.hasNext())
		{
			int key = itMap1Key.next();
			
			map3.put(key , map1.get(key));
		}
		System.out.println("Taille après map1: " + map3.size());
		
		Iterator<Integer> itMap2Key = map2.keySet().iterator();

		while(itMap2Key.hasNext())
		{
			int key = itMap2Key.next();
			
			map3.put(key , map2.get(key));
		}
		System.out.println("Taille après map2: " +map3.size());

		Iterator<Integer> itMap3Key = map3.keySet().iterator();

		while(itMap3Key.hasNext())
		{
			int key = itMap3Key.next();
			
			System.out.println("Key : " + key + " Valeur " + map3.get(key));
		}
	}
}

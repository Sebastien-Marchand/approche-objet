package fr.diginamic.jdr;

import java.util.Random;

public class AleatoireStats {
	
	public static int Rand(int min, int max)
	{
		int champAction = (max + 1 ) - min;
		Random rand = new Random();
		
		return rand.nextInt(champAction)+min;
	}
}

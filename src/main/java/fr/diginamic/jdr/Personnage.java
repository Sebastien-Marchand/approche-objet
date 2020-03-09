package fr.diginamic.jdr;

public class Personnage {
	int vieMax = 50;
	int vieMin = 20;
	
	int forceMax = 18;
	int forceMin = 12;
	
	protected int force;
	protected int pointsDeVie;
	protected int score;
	
	public Personnage(){
		force = AleatoireStats.Rand(forceMin, forceMax);
		pointsDeVie = AleatoireStats.Rand(vieMin, vieMax);
		score = 0;
	}
}

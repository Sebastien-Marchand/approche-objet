package fr.diginamic.jdr;

public class Gobelin extends Monstre{
	
	int vieMax = 15;
	int vieMin = 10;
	
	int forceMax = 10;
	int forceMin = 5;
	
	int valScore = 2;

	public Gobelin(){
		force = AleatoireStats.Rand(forceMin, forceMax);
		pointsDeVie = AleatoireStats.Rand(vieMin, vieMax);
		score = valScore;
		nomMonstre = "Gobelin";
	}


	public String affichageMonstre() {
		return "             ,      ,\r\n" + 
				"            /(.-\"\"-.)\\\r\n" + 
				"        |\\  \\/      \\/  /|\r\n" + 
				"        | \\ / =.  .= \\ / |\r\n" + 
				"        \\( \\   o\\/o   / )/\r\n" + 
				"         \\_, '-/  \\-' ,_/\r\n" + 
				"           /   \\__/   \\\r\n" + 
				"           \\ \\__/\\__/ /\r\n" + 
				"         ___\\ \\|--|/ /___\r\n" + 
				"       /`    \\      /    `\\\r\n" + 
				"  jgs /       '----'       \\";
	}
}

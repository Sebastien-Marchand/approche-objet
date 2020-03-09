package fr.diginamic.jdr;

public class Loup extends Monstre{
	
	int vieMax = 10;
	int vieMin = 5;
	
	int forceMax = 8;
	int forceMin = 3;
	
	int valScore = 1;
	
	public Loup(){
		force = AleatoireStats.Rand(forceMin, forceMax);
		pointsDeVie = AleatoireStats.Rand(vieMin, vieMax);
		score = valScore;
		nomMonstre = "Loup";
	}

	
	public String affichageMonstre() {
		return "_________Z\r\n" + 
				"________ZZZ\r\n" + 
				"______Z_ZZZZZ\r\n" + 
				"______ZZZZZZZZZ\r\n" + 
				"_______ZZZZZAZZZZ\r\n" + 
				"________ZZZZZZZZZZZ\r\n" + 
				"_________ZZZZZZZZZ\r\n" + 
				"_________ZZZZZZZZZ\r\n" + 
				"_________ZZZZZZZZZZ\r\n" + 
				"_________ZZZZZZZZZZZ\r\n" + 
				"_________ZZZZZZZZZZZZZ\r\n" + 
				"_________ZZZZZZZZZZZZZZ\r\n" + 
				"_________ZZZZZZZZZZZZZZZZZ\r\n" + 
				"_________ZZZZZZZZZZZZZZZZZZZ\r\n" + 
				"_________ZZZZZZZZZZZZZZZZZZZZ\r\n" + 
				"__________ZZZZZZZZZZZZZZZZZZZZZZZ\r\n" + 
				"___________ZZZZZZZZZZZZZZZZZZZZZZZZZZZ\r\n" + 
				"___________ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ\r\n" + 
				"_____________ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ\r\n" + 
				"______________ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ\r\n" + 
				"______________ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ\r\n" + 
				"_______________ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ\r\n" + 
				"_______________ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ\r\n" + 
				"________________ZZZZ__ZZZ____ZZZZZZZZZZZZZZZZZZ\r\n" + 
				"_________________ZZ___ZZZ_____ZZZZZZZZZZZZZZZZZZ\r\n" + 
				"_________________ZZ___ZZZ_____ZZZZZZZZZZZZZZZZZZZZZ___ZZ\r\n" + 
				"_________________ZZ___ZZZ______ZZZZZZZZZZZZZ_ZZZZZZZZZZZ\r\n" + 
				"_________________ZZ___ZZZ______ZZZZZZZZZZZZZZ_ZZZZZZZZZ\r\n" + 
				"________________ZZZ___ZZ_________ZZZZZ___ZZZZZ\r\n" + 
				"___________ZZZZZZZ___ZZZ__________ZZZZZ____ZZZ\r\n" + 
				"________ZZZZZZZZZZZZZZZ_____________ZZZ____ZZZ\r\n" + 
				"____ZZZZZZZZZZZZZZZZZZZZZZZ_________ZZZ_____ZZZ\r\n" + 
				"___ZZZZZZZZZZZZZZZZZZZZZZZZZZZ______ZZZ______ZZZ\r\n" + 
				"__ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ_______ZZZ\r\n" + 
				"_ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ_____ZZZ\r\n" + 
				"_ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ_ZZZ\r\n" + 
				"_ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ\r\n" + 
				"_ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ\r\n" + 
				"_ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ";
	}

}

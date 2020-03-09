package fr.diginamic.jdr;

public class Combat {
	Monstre monstreEnemie;
	Personnage lePersonnage;
	int score;
	int nbMonstreDiff = 3;
	int minAttaqueAlea = 1;
	int maxAttaqueAlea = 10;
	
	 Combat(Personnage lePersonnage) {
		 this.lePersonnage = lePersonnage;
		switch( AleatoireStats.Rand(1, nbMonstreDiff))
		{
			case 1:
				monstreEnemie = new Loup();
				break;
			case 2:
				monstreEnemie = new Gobelin();
				break;
			case 3:
				monstreEnemie = new Troll();
				break;
		}
	}
	 public boolean Combattre(){
		 boolean victoire =false;
		 System.out.println(monstreEnemie.affichageMonstre());
		 System.out.println("C'est un " + monstreEnemie.nomMonstre + "!\n");
		 Waiting();
		 do
		 {
			 int attaqueMonstre = monstreEnemie.force + AleatoireStats.Rand(minAttaqueAlea, maxAttaqueAlea);
			 int attaquePersonnage = lePersonnage.force + AleatoireStats.Rand(minAttaqueAlea, maxAttaqueAlea);
			 System.out.println("attaque du monstre : " + attaqueMonstre + " Attaque du joueur : " + attaquePersonnage);
			 System.out.println("PV du monstre : " + monstreEnemie.pointsDeVie + " PV du joueur : " + lePersonnage.pointsDeVie + "\n");
			 Waiting();
			 if(attaqueMonstre != attaquePersonnage)
			 {
				 if(attaqueMonstre > attaquePersonnage) 
				 {
					 int dommage = calculdommage(attaqueMonstre , attaquePersonnage);
					 lePersonnage.pointsDeVie -= dommage;
					 
					 if(lePersonnage.pointsDeVie >0)
					 {
						 System.out.println("Le " + monstreEnemie.nomMonstre + "gagne le tour !\nil vous inflige :" + dommage + "\nPoint de vie restant :"+lePersonnage.pointsDeVie);
					 }
					 else
					 {
						 System.out.println("Le " + monstreEnemie.nomMonstre + "gagne le tour !\nil vous inflige :" + dommage + "\nVous n'avez plus de point de vie !");
					 }
				 }
				 else
				 {
					 int dommage = calculdommage(attaquePersonnage , attaqueMonstre);
					 monstreEnemie.pointsDeVie -= dommage;
	
					 if(monstreEnemie.pointsDeVie >0)
					 {
						 System.out.println("Vous gagnez le tour !\nvous infligez :" + dommage + "\nPoint de vie du" + monstreEnemie.nomMonstre+" restant :" + monstreEnemie.pointsDeVie);
					 }
					 else
					 {
						 System.out.println("Vous gagnez le tour !\nvous infligez :" + dommage + "\nLe " + monstreEnemie.nomMonstre + "n'a plus de point de vie !");
						 victoire = true;
					 }
				 }
				 Waiting();
			 }
			 else {
				 System.out.println("L'attaque du " + monstreEnemie.nomMonstre + " et la votre sont identique. Aucun dommage ne peux être fait.");
			 }
		 }while(lePersonnage.pointsDeVie >0 && monstreEnemie.pointsDeVie > 0);
		 
		 if(victoire == true)
		 {
			 System.out.println("Vous avez gagné le combat !");
			 lePersonnage.score += monstreEnemie.score;
			 return true;
		 }
		 else {
			 System.out.println("Vous avez perdu le combat !");
			 return false;
		 }
	 }
	 
	 protected int calculdommage(int meilleurAttaque , int faibleAttaque)
	 {
		 return meilleurAttaque - faibleAttaque;
	 }
	 private static void Waiting()
	 {
		 try {
             Thread.sleep(1500);
         } catch (InterruptedException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
	 }
}

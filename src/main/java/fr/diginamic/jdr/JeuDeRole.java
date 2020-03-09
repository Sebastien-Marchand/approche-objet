package fr.diginamic.jdr;

import java.util.Scanner;

public class JeuDeRole {

	public static void main(String[] args) {
		
		int choix = 0;
		Personnage monPersonnage = null;
		try ( Scanner saisieJoueur = new Scanner( System.in ) ) {
			AfficherMenueJeu();
			
			do{
				choix = saisieJoueur.nextInt();
				switch (choix){
				
					case 0:
						System.out.println("Fin de la Partie");
						break;
						
					case 1:
						monPersonnage = new Personnage();
						System.out.println("Un nouveau Personnage est dans la place !");
						break;
						
					case 2:
						if(monPersonnage != null && monPersonnage.pointsDeVie > 0)
						{
							Combat monCombat = new Combat(monPersonnage);
							if(!monCombat.Combattre())
							{
								AfficherMenueJeu();
								System.out.println("Fin de la Partie.\nVotre score est de :" + monPersonnage.score);
							}
							else {
								AfficherMenueJeu();
							}
						}
						else {
							AfficherMenueJeu();
							System.out.println("Votre personnage est mort ! Créer en un nouveau si tu souhaite jouer !");
						}
						break;
						
					case 3:
						if(monPersonnage != null)
						{
							AfficherMenueJeu();
							System.out.println("Vous avez un score de :" + monPersonnage.score);
						}
						else
						{
							AfficherMenueJeu();
							System.out.println("Aucun personnage n'est disponible");
						}
						break;
					case 4:
						if(monPersonnage != null)
						{
							AfficherMenueJeu();
							System.out.println("Les statistiques de votre personnage sont :\n\t\tForce :" + monPersonnage.force + "\n\t\tPoints de vie: :"
									+ monPersonnage.pointsDeVie);
						}
						else
						{
							AfficherMenueJeu();
							System.out.println("Aucun personnage n'est disponible");
						}
						break;
				
				}
			}while(choix !=0);
		}

	}
	private static void AfficherMenueJeu() {
		System.out.println("___  ___                _              _____                      \r\n" + 
				"|  \\/  |               | |            |  __ \\                     \r\n" + 
				"| .  . | ___  _ __  ___| |_ ___ _ __  | |  \\/ __ _ _ __ ___   ___ \r\n" + 
				"| |\\/| |/ _ \\| '_ \\/ __| __/ _ \\ '__| | | __ / _` | '_ ` _ \\ / _ \\\r\n" + 
				"| |  | | (_) | | | \\__ \\ ||  __/ |    | |_\\ \\ (_| | | | | | |  __/\r\n" + 
				"\\_|  |_/\\___/|_| |_|___/\\__\\___|_|     \\____/\\__,_|_| |_| |_|\\___|\n");
		System.out.println("1\t-\tCréer Personnage\n2\t-\tCombattre la créature\n3\t-\tAfficher le score\n4\t-\tAfficher les statistique\n0\t-\tSortir");
	}

}

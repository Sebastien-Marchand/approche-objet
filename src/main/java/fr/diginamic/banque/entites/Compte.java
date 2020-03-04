package fr.diginamic.banque.entites;


/**
 * @author Sébastien MARCHAND
 * Classe Compte TP 1
 * Mettre en place les règles de l'encapsulation
 *
 */
public class Compte {

		int numeroCompte = 0;
		int soldeCompte = 0;
		

		/**
		 * Constructeur avec 2 paramètres de type integer
		 * 
		 * @param numeroCompte
		 * @param soldeCompte
		 */
		public Compte(int numeroCompte, int soldeCompte)
		{
			this.numeroCompte = numeroCompte;
			this.soldeCompte = soldeCompte;
		}

}

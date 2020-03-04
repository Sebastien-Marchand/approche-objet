package fr.diginamic.banque;
import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

/**
 * @author atlantis
 *Classe TestBanque executable
 *Permet de retourn� l'adresse de l'instanciation r�aliser
 */
public class TestBanque {

	public static void main(String[] args) {

		Compte monCompte = new Compte(0, 2000);
		System.out.println(monCompte);
		CompteTaux monCompteTaux = new CompteTaux (0 , 1500 , 5);
		System.out.println(monCompteTaux);

		Compte monCompteTab[] = new Compte[2];
		monCompteTab[0] = monCompte;
		monCompteTab[1] = monCompteTaux;
		
		for(int i = 0 ; i < 2 ; i++)
		{
			System.out.println(monCompteTab[i]);
		}
	}

}

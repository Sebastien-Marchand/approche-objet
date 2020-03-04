package fr.diginamic.banque;
import fr.diginamic.banque.entites.Compte;

/**
 * @author atlantis
 *Classe TestBanque executable
 *Permet de retourné l'adresse de l'instanciation réaliser
 */
public class TestBanque {

	public static void main(String[] args) {

		Compte monCompte = new Compte(0, 1500);
		System.out.println(monCompte);

	}

}

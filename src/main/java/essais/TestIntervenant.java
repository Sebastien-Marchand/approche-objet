package essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {

		Salarie monSalarie = new Salarie("Muriel" , "Antoine" , 1980.48);
		System.out.println(monSalarie.afficherDonnees());
		
		Pigiste monPigiste = new Pigiste("Jules" ,  "Moriartie" , 5 , 48.77);
		System.out.println(monPigiste.afficherDonnees());

	}

}

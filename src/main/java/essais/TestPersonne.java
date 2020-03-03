package essais;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne monPersonnage = new Personne();
		
		monPersonnage.nom = "Malacoff";
		monPersonnage.prenom = "joseph";
		monPersonnage.adressePostal = "13 rue de la poisse";
		
		Personne monPersonnage2 = new Personne();
		
		monPersonnage2.nom = "paloudouli";
		monPersonnage2.prenom = "Yen-gi";
		monPersonnage2.adressePostal = "69 avenue du general du BBQ";
																			//Le nombre de ligne pour instancié une personne est courte, mais cela demande
																			//beaucoup de ligne pour initialiser les valeurs de chaque personne
	}

}
